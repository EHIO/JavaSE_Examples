package org.wg.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectDemo4 {
	
	@Test
	public void demo() throws Exception {
		Class c = Class.forName("org.wg.bean.Person");
		// ��ȡ�Լ��İ������׵����й�������
		Method[] methods = c.getMethods();
		//��ȡ��������з���������˽��
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
		m.invoke(obj, null);//����ֵ��ʹ�ò��� args �� obj ��ָ�ɸö�������ʾ�����Ľ�� 

	}
	
	@Test
	public void demo3() throws Exception {
		Class c = Class.forName("org.wg.bean.Person");
		
		Object obj = c.newInstance();
		
		Method m = c.getMethod("getString", String.class, int.class);
		System.out.println(m.invoke(obj, "Сǿ", 9527));
		
	}
	
	@Test
	public void demo4() throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("org.wg.bean.Person");
		Object obj = c.newInstance();
		// private void function()
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);
	}
	
}
