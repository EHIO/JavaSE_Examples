package org.wg.iterator.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator():�����������ϵ�ר�ñ�����ʽ
 * 		Object next():��ȡԪ��,���ƶ�����һ��λ�á�
 * 			NoSuchElementException��û��������Ԫ�أ���Ϊ���Ѿ��ҵ�����ˡ�
 * 		boolean hasNext():�������Ԫ�ؿ��Ե������򷵻� true����
 */
public class IteratorDemo {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // ���������Ԫ��
        // String s = "hello";
        // c.add(s);
        c.add("hello");
        c.add("world");
        c.add("java");

        // Iterator iterator():�����������ϵ�ר�ñ�����ʽ
        Iterator it = c.iterator(); // ʵ�ʷ��صĿ϶���������������Ƕ�̬

        // Object obj = it.next();
        // System.out.println(obj);
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // ���һ����Ӧ��д�����ԣ�����Ӧ����ÿ�λ�ȡǰ�������һ���жϾͺ���
        // �ж��Ƿ�����һ��Ԫ�أ��оͻ�ȡ��û�оͲ�������

        // if (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // if (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // if (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // if (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // if (it.hasNext()) {
        // System.out.println(it.next());
        // }

        // ���հ����
        while (it.hasNext()) {
            // System.out.println(it.next());
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
