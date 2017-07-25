package org.wg.reflect;

import org.junit.Test;
import org.wg.bean.Person;

/*
 * ���䣺����ͨ��class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա������
 * 
 * Person p = new Person();
 * p.ʹ��
 * 
 * Ҫ������ʹ�ã����������õ�class�ļ�������ʵҲ���ǵõ�Class��Ķ���
 * Class�ࣺ
 * 		��Ա����	Field
 * 		���췽��	Constructor
 * 		��Ա����	Method
 * 
 * ��ȡclass�ļ�����ķ�ʽ��
 * A:Object���getClass()����
 * B:�������͵ľ�̬����class
 * C:Class���еľ�̬����
 * 		public static Class forName(String className)
 * 
 * һ�����ǵ���ʹ��˭��?
 * 		A:�Լ���	��ѡһ�֣��ڶ��ֱȽϷ���
 * 		B:����	������
 * 			Ϊʲô��?��Ϊ��������һ���ַ�����������һ��������������������ǾͿ��԰��������ַ������õ������ļ��С�
 */
public class ReflectDemo {

	/**
	 * @throws ClassNotFoundException
	 */
	@Test
	public void getClassObject_3() throws ClassNotFoundException {
		Class clazz = Class.forName("org.wg.bean.Person");
		System.out.println(clazz);
	}

	/**
	 * @return
	 */
	@Test
	public void getClassObject_2() {
		Class clazz = Person.class;
		Class clazz2 = Person.class;
		System.err.println(clazz == clazz2);
	}

	@Test
	public void getClassObject_1() {
		// ��ʽ1
		Person p = new Person();
		Class c = p.getClass();

		Person p2 = new Person();
		Class c2 = p2.getClass();

		System.out.println(p == p2);// false
		System.out.println(c == c2);// true
	}
}
