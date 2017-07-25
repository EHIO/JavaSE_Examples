package org.wg.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

/*
 * 	��ȡ���췽��
		public Constructor[] getConstructors():���й������췽��
		public Constructor[] getDeclaredConstructors():���й��췽��
 */
public class ReflectDemo2 {
	/*
	 * ͨ�������ȡ���췽����ʹ�á�
	 */
	@Test
	public void demo() throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("org.wg.bean.Person");
		// ��ȡ�������췽��
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		// ������ʾ���ǣ���Ҫ��ȡ�Ĺ��췽���Ĺ�������������������͵�class�ֽ����ļ�����
		Constructor con = c.getConstructor();// ���ص��ǹ��췽������
		// ʹ�ô� Constructor �����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ����
		Object obj = con.newInstance();
		System.out.println(obj);
		// Person p = (Person)obj;
		// p.show();
	}
	/*
	 *ͨ�������ȡ�ù��췽��
	 * public Person(String name, int age, String address)
	 */
	@Test
	public void demo2() throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("org.wg.bean.Person");

		// ��ȡ���ι��췽������
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor(String.class, int.class,
				String.class);

		// ͨ�����ι��췽�����󴴽�����
		// public T newInstance(Object... initargs)
		Object obj = con.newInstance("����ϼ", 27, "����");
		
		System.out.println(obj);
	}
	/*
	 * ����ͨ�������ȡ˽�й��췽����ʹ��
	 * private Person(String name){}
	 * 
	 * Person p = new Person("������");
	 * System.out.println(p);
	 */
	@Test
	public void demo3() throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("org.wg.bean.Person");

		// ��ȡ˽�й��췽������
		// NoSuchMethodException��ÿ����������쳣
		// ԭ����һ��ʼ����ʹ�õķ���ֻ�ܻ�ȡ�����ģ��������ַ�ʽ�Ϳ����ˡ�
		Constructor con = c.getDeclaredConstructor(String.class);

		// �ø�˽�й��췽����������
		// IllegalAccessException:�Ƿ��ķ����쳣��
		// ��������
		con.setAccessible(true);// ֵΪtrue��ָʾ����Ķ�����ʹ��ʱӦ��ȡ��Java���Է��ʼ�顣
		Object obj = con.newInstance("������");

		System.out.println(obj);
	}
}
