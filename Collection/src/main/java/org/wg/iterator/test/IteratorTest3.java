package org.wg.iterator.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�ַ�����������
 * 
 * ������
 * 		A:�������϶���
 * 		B:�����ַ�������
 * 		C:���ַ���������ӵ�������
 * 		D:��������
 */
public class IteratorTest3 {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // �����ַ�������
        // ���ַ���������ӵ�������
        c.add("����ϼ");
        c.add("������");
        c.add("����");
        c.add("����");
        c.add("������");

        // ��������
        // ͨ�����϶����ȡ����������
        Iterator it = c.iterator();
        // ͨ�������������hasNext()�����ж���û��Ԫ��
        while (it.hasNext()) {
            // ͨ�������������next()������ȡԪ��
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}