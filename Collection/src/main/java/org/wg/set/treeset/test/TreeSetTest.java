package org.wg.set.treeset.test;

import java.util.TreeSet;


/*
 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ��
 * 
 * A:��û�и���������ô����
 * 		��Ȼ���򣬰��������С��������
 * B:Ԫ��ʲô�����Ψһ��Ҳû������
 * 		��Ա����ֵ����ͬ��Ϊͬһ��Ԫ��
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // �������϶���
        TreeSet<Student> ts = new TreeSet<Student>();

        // ����Ԫ��
        Student s1 = new Student("linqingxia", 27);
        Student s2 = new Student("zhangguorong", 29);
        Student s3 = new Student("wanglihong", 23);
        Student s4 = new Student("linqingxia", 27);
        Student s5 = new Student("liushishi", 22);
        Student s6 = new Student("wuqilong", 40);
        Student s7 = new Student("fengqingy", 22);

        // ���Ԫ��
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        // ����
        for (Student s : ts) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
