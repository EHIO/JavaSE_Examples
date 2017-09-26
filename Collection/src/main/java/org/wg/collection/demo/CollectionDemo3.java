package org.wg.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϵı�������ʵ�������λ�ȡ�����е�ÿһ��Ԫ�ء�
 * 
 * Object[] toArray():�Ѽ���ת�����飬����ʵ�ּ��ϵı���
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // ���Ԫ��
        c.add("hello"); // Object obj = "hello"; ����ת��
        c.add("world");
        c.add("java");

        // ����
        // Object[] toArray():�Ѽ���ת�����飬����ʵ�ּ��ϵı���
        Object[] objs = c.toArray();
        for (int x = 0; x < objs.length; x++) {
            // System.out.println(objs[x]);
            // ��֪��Ԫ�����ַ��������ڻ�ȡ��Ԫ�صĵ�ͬʱ������֪��Ԫ�صĳ��ȡ�
            // System.out.println(objs[x] + "---" + objs[x].length());
            // �����ʵ�ֲ��ˣ�ԭ����Object��û��length()����
            // ����Ҫ��ʹ���ַ����ķ������ͱ����Ԫ�ػ�ԭ���ַ���
            // ����ת��
            String s = (String) objs[x];
            System.out.println(s + "---" + s.length());
        }
    }
}