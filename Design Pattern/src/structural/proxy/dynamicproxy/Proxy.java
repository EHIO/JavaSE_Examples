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
     *
     * @param infce
     * @param h
     * @return
     * @throws Exception
     */
    public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception { //JDK6 Complier API, CGLib, ASM
        String methodStr = "";
        String rt = "\r\n";

        Method[] methods = infce.getMethods();
        infce.getPackage();
        h.getClass().getInterfaces()[0].getName();
        /*
		for(Method m : methods) {
			methodStr += "@Override" + rt + 
						 "public void " + m.getName() + "() {" + rt +
						 	"   long start = System.currentTimeMillis();" + rt +
							"   System.out.println(\"starttime:\" + start);" + rt +
							"   t." + m.getName() + "();" + rt +
							"   long end = System.currentTimeMillis();" + rt +
							"   System.out.println(\"time:\" + (end-start));" + rt +
						 "}";
		}
		*/
        for (Method m : methods) {
            methodStr += "@Override" + rt +
                    "public void " + m.getName() + "() {" + rt +
                    "    try {" + rt +
                    "    Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
                    "    h.invoke(this, md);" + rt +
                    "    }catch(Exception e) {e.printStackTrace();}" + rt +

                    "}";
        }

        String src =
                infce.getPackage() + ";" + rt +
                        "import java.lang.reflect.Method;" + rt +
                        "public class $Proxy0 implements " + infce.getName() + " {" + rt +
                        "    public $Proxy0(InvocationHandler h) {" + rt +
                        "        this.h = h;" + rt +
                        "    }" + rt +
                        "	 " + h.getClass().getInterfaces()[0].getName() + " h;" + rt +
                        "	 " + methodStr + rt +
                        "}";
//		System.getProperty("user.dir") user.dir指定了当前的路径 
        String fileDir = System.getProperty("user.dir") + "/src/proxy/dynamicproxy/";
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
        Class c = ul.loadClass("proxy.dynamicproxy.$Proxy0");
        System.out.println(c);

        Constructor ctr = c.getConstructor(InvocationHandler.class);
        Object m = ctr.newInstance(h);
        //m.move();

        return m;
    }
}
