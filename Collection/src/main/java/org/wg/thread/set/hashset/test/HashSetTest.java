package org.wg.thread.set.hashset.test;

import java.util.HashSet;


/*
 * ���󣺴洢�Զ�����󣬲���֤Ԫ�ص�Ψһ��
 * Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ��Ԫ�ء�
 * 
 * Ŀǰ�ǲ������ҵ�Ҫ��ģ���Ϊ����֪��HashSet�ײ���������hashCode()��equals()������
 * ������������������ѧ������û����д�����ԣ�Ĭ��ʹ�õ���Object�ࡣ
 * ���ʱ�����ǵĹ�ϣֵ�ǲ���һ���ģ������Ͳ�������жϣ�ִ������Ӳ�����
 */
public class HashSetTest {
    public static void main(String[] args) {
        // �������϶���
        HashSet<Student> hs = new HashSet<Student>();

        // ����ѧ������
        Student s1 = new Student("����ϼ", 27);
        Student s2 = new Student("����", 22);
        Student s3 = new Student("������", 30);
        Student s4 = new Student("����ϼ", 27);
        Student s5 = new Student("����ϼ", 20);
        Student s6 = new Student("������", 22);

        // ���Ԫ��
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);

        // ��������
        for (Student s : hs) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
