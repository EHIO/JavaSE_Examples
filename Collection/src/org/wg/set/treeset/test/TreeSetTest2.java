package org.wg.set.treeset.test;

import java.util.TreeSet;


/*
 * 需求：请按照姓名的长度排序
 */
public class TreeSetTest2 {
	public static void main(String[] args) {
		// 创建集合对象
		TreeSet<Person> ts = new TreeSet<Person>();

		// 创建元素
		Person s1 = new Person("linqingxia", 27);
		Person s2 = new Person("zhangguorong", 29);
		Person s3 = new Person("wanglihong", 23);
		Person s4 = new Person("linqingxia", 27);
		Person s5 = new Person("liushishi", 22);
		Person s6 = new Person("wuqilong", 40);
		Person s7 = new Person("fengqingy", 22);
		Person s8 = new Person("linqingxia", 29);

		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// 遍历
		for (Person s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
