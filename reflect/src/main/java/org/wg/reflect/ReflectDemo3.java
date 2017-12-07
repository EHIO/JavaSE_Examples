package org.wg.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class ReflectDemo3 {

	/*
	 * 获取字节码文件中的字段。
	 */
	@Test
	public void getFieldDemo() throws Exception {

		Class clazz = Class.forName("org.wg.reflect.Person");

		Field field = null;//clazz.getField("age");//只能获取公有的，

		field = clazz.getDeclaredField("age");//只获取本类，但包含私有。

		//对私有字段的访问取消权限检查。暴力访问。
		field.setAccessible(true);

		// 创建对象
		Object obj = clazz.newInstance();
		// 为对象的字体赋值
		field.set(obj, 89);
		// 获取字体值
		Object o = field.get(obj);

		System.out.println(o);
	}
}

