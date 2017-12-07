package org.wg.collection.set.treeset.demo;

import java.util.TreeSet;

/*
 * TreeSet���ܹ���Ԫ�ذ���ĳ�ֹ����������
 * ���������ַ�ʽ
 * A:��Ȼ����
 * B:�Ƚ�������
 * 
 * TreeSet���ϵ��ص㣺�����Ψһ
 * 
 * ͨ���۲�TreeSet��add()����������֪������Ҫ��TreeMap��put()������
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        // �������϶���
        // ��Ȼ˳���������
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // ����Ԫ�ز����
        // 20,18,23,22,17,24,19,18,24
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);
        ts.add(24);

        // ����
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}