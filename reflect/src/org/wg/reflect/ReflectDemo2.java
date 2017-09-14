package org.wg.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/*
 * 	获取构造方法
		public Constructor[] getConstructors():所有公共构造方法
		public Constructor[] getDeclaredConstructors():所有构造方法
 */
public class ReflectDemo2 {
    /*
     * 通过反射获取构造方法并使用。
     */
    @Test
    public void demo() throws Exception {
        // 获取字节码文件对象
        Class c = Class.forName("org.wg.bean.Person");
        // 获取单个构造方法
        // public Constructor<T> getConstructor(Class<?>... parameterTypes)
        // 参数表示的是：你要获取的构造方法的构造参数个数及数据类型的class字节码文件对象
        Constructor con = c.getConstructor();// 返回的是构造方法对象
        // 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
        Object obj = con.newInstance();
        System.out.println(obj);
        // Person p = (Person)obj;
        // p.show();
    }

    /*
     *通过反射获取该构造方法
     * public Person(String name, int age, String address)
     */
    @Test
    public void demo2() throws Exception {
        // 获取字节码文件对象
        Class c = Class.forName("org.wg.bean.Person");

        // 获取带参构造方法对象
        // public Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor con = c.getConstructor(String.class, int.class,
                String.class);

        // 通过带参构造方法对象创建对象
        // public T newInstance(Object... initargs)
        Object obj = con.newInstance("林青霞", 27, "北京");

        System.out.println(obj);
    }

    /*
     * 需求：通过反射获取私有构造方法并使用
     * private Person(String name){}
     *
     * Person p = new Person("风清扬");
     * System.out.println(p);
     */
    @Test
    public void demo3() throws Exception {
        // 获取字节码文件对象
        Class c = Class.forName("org.wg.bean.Person");

        // 获取私有构造方法对象
        // NoSuchMethodException：每个这个方法异常
        // 原因是一开始我们使用的方法只能获取公共的，下面这种方式就可以了。
        Constructor con = c.getDeclaredConstructor(String.class);

        // 用该私有构造方法创建对象
        // IllegalAccessException:非法的访问异常。
        // 暴力访问
        con.setAccessible(true);// 值为true则指示反射的对象在使用时应该取消Java语言访问检查。
        Object obj = con.newInstance("风清扬");

        System.out.println(obj);
    }
}
