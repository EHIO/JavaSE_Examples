package structural.proxy.dynamicproxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Proxy {
	/**
	 * 生成代理对象
	 * @param infce
	 * @param h
	 * @return
	 * @throws Exception
	 */
	public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception { //JDK6 Complier API, CGLib, ASM
		String methodStr = "";
		String rt = "\r\n";
		Method[] methods = infce.getMethods();
		for (Method m : methods) {
			methodStr += "@Override" + rt +
					"\t" + "public void " + m.getName() + "() {" + rt +
					"\t" + "    try {" + rt +
					"\t" + "		Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
					"\t" + "		h.invoke(this, md);" + rt +
					"\t" + "	} catch (Exception e) {e.printStackTrace();}" + rt +
					"\t" + "}";
		}
		String src =
					infce.getPackage() + ";" + rt +
						"import java.lang.reflect.Method;" + rt +
						"public class $Proxy0 implements " + infce.getName() + " {" + rt +
						"    " + h.getClass().getInterfaces()[0].getName() + " h;" + rt +
						"    public $Proxy0(InvocationHandler h) {" + rt +
						"        this.h = h;" + rt +
						"	 }" + rt +
						"    " + methodStr + rt +
						"}";
		System.err.println("生成的代理类源码：" + rt + src);
		String fileDir = System.getProperty("user.dir") + "/src/structural/proxy/dynamicproxy/";
		String fileName = fileDir + "$Proxy0.java";
		File f = new File(fileDir);
		if (!f.exists()) {
			f.mkdirs();
		}
		f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();

		//compile
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();

		//load into memory and create an instance
		URL[] urls = new URL[]{new URL("file:/" + "d:/src/")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("structural.proxy.dynamicproxy.$Proxy0");
		System.out.println(c);

		Constructor ctr = c.getConstructor(InvocationHandler.class);
		Object m = ctr.newInstance(h);
		return m;
	}
}
