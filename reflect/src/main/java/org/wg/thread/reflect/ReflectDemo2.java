package org.wg.thread.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {

	@Test
	public void createNewObject_2() throws Exception {
		/*
		 * 当获取指定名称对应类中的所体现的对象时，
		 * 而该对象初始化不使用空参数构造该怎么办呢？
		 * 既然是通过指定的构造 函数进行对象的初始化，
		 * 所以应该先获取到该构造函数。 通过字节码文件对象即可完成。
		 * 该方法是：getConstructor(paramterTypes);
		 *
		 */
		String name = "Person";
		Class clazz = Class.forName(name);
		//获取到了指定的构造函数对象。
		Constructor constructor = clazz.getConstructor(String.class, int.class);
		//通过该构造器对象的newInstance方法进行对象的初始化。
		Object obj = constructor.newInstance("小明", 38);
		System.out.println(obj);
	}

	@Test
	public void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String name = "Person";
		Class clazz = Class.forName(name);
		Object obj = clazz.newInstance();
		System.out.println(obj);
	}
}
