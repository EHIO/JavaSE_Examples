package org.wg.set.hashset.demo;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet:�ײ����ݽṹ�ɹ�ϣ���������ɡ�
 * ��ϣ��֤Ԫ�ص�Ψһ�ԡ�
 * ����֤Ԫ������(�洢��ȡ����һ��)
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // �������϶���
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        // ���������Ԫ��
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");
        hs.add("java");

        // ����
        for (String s : hs) {
            System.out.println(s);
        }
    }
}