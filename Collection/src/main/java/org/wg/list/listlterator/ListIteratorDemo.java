package org.wg.list.listlterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * �б��������
 * 		ListIterator listIterator()��List�������еĵ�����
 * 		�õ������̳���Iterator�����������ԣ��Ϳ���ֱ��ʹ��hasNext()��next()������
 * 
 * ���й��ܣ�
 * 		Object previous():��ȡ��һ��Ԫ��
 * 		boolean hasPrevious():�ж��Ƿ���Ԫ��
 * 
 * 		ע�⣺ListIterator����ʵ��������������Ǳ�������������������������������һ�������壬��ʹ�á�
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        // ����List���϶���
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        // ListIterator listIterator()
        ListIterator lit = list.listIterator(); // �������
        // while (lit.hasNext()) {
        // String s = (String) lit.next();
        // System.out.println(s);
        // }
        // System.out.println("-----------------");

        // System.out.println(lit.previous());
        // System.out.println(lit.previous());
        // System.out.println(lit.previous());
        // NoSuchElementException
        // System.out.println(lit.previous());

        while (lit.hasPrevious()) {
            String s = (String) lit.previous();
            System.out.println(s);
        }
        System.out.println("-----------------");

        // ������
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println("-----------------");

    }
}
