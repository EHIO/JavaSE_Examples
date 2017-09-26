package org.wg.iterator.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ����1:����whileѭ��д����������ܲ�����forѭ����?
 * ����2:��Ҫ���ʹ��it.next()��������Ϊÿ��ʹ�ö��Ƿ���һ������
 */
public class IteratorTest2 {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // ����ѧ������
        Student s1 = new Student("����ϼ", 27);
        Student s2 = new Student("������", 30);
        Student s3 = new Student("�����", 33);
        Student s4 = new Student("����", 25);
        Student s5 = new Student("������", 22);

        // ��ѧ����ӵ�������
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

        // ����
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());

            // NoSuchElementException ��Ҫ���ʹ��it.next()����
            // System.out.println(((Student) it.next()).getName() + "---"
            // + ((Student) it.next()).getAge());

        }
        // System.out.println("----------------------------------");

        // forѭ����д
        // for(Iterator it = c.iterator();it.hasNext();){
        // Student s = (Student) it.next();
        // System.out.println(s.getName() + "---" + s.getAge());
        // }
    }
}
