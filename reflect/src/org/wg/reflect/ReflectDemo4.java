package org.wg.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {

    @Test
    public void demo() throws Exception {
        Class c = Class.forName("org.wg.bean.Person");
        // 获取自己的包括父亲的所有公共方法
        Method[] methods = c.getMethods();
        //获取本类的所有方法，包含私有
        methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.err.println(m);
        }
        System.out.println("----------------------------------");
        Method method = c.getMethod("notify", null);
//		method = c.getDeclaredMethod("getString", String.class,int.class);
        System.out.println(method);
    }

    @Test
    public void demo2() throws Exception {
        Class c = Class.forName("org.wg.bean.Person");

        Constructor constructor = c.getConstructor();
        Object obj = constructor.newInstance();
//		Object obj = c.newInstance();

        Method m = c.getMethod("show");
        m.invoke(obj, null);//返回值：使用参数 args 在 obj 上指派该对象所表示方法的结果

    }

    @Test
    public void demo3() throws Exception {
        Class c = Class.forName("org.wg.bean.Person");

        Object obj = c.newInstance();

        Method m = c.getMethod("getString", String.class, int.class);
        System.out.println(m.invoke(obj, "小强", 9527));

    }

    @Test
    public void demo4() throws Exception {
        // 获取字节码文件对象
        Class c = Class.forName("org.wg.bean.Person");
        Object obj = c.newInstance();
        // private void function()
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);
    }

}
