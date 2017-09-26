package org.wg.set.treeset.test;

import java.util.TreeSet;


/*
 * �����밴�������ĳ�������
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        // �������϶���
        TreeSet<Person> ts = new TreeSet<Person>();

        // ����Ԫ��
        Person s1 = new Person("linqingxia", 27);
        Person s2 = new Person("zhangguorong", 29);
        Person s3 = new Person("wanglihong", 23);
        Person s4 = new Person("linqingxia", 27);
        Person s5 = new Person("liushishi", 22);
        Person s6 = new Person("wuqilong", 40);
        Person s7 = new Person("fengqingy", 22);
        Person s8 = new Person("linqingxia", 29);

        // ���Ԫ��
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);

        // ����
        for (Person s : ts) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
