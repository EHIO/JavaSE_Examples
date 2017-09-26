package org.wg.list;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵ����б������ܣ�
 * 		size()��get()�������ʹ��
 */
public class ListDemo2 {
    public static void main(String[] args) {
        // �������϶���
        List list = new ArrayList();

        // ���Ԫ��
        list.add("hello");
        list.add("world");
        list.add("java");

        // Object get(int index):��ȡָ��λ�õ�Ԫ��
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // IndexOutOfBoundsException
        // System.out.println(list.get(3));

        // ��ѭ���Ľ�
        // for (int x = 0; x < 3; x++) {
        // System.out.println(list.get(x));
        // }
        // ���Ԫ�ع��࣬�������ͱȽ��鷳����������ʹ�ü��ϵ�һ�����ȹ��ܣ�size()
        // ���յı�����ʽ���ǣ�size()��get()
        for (int x = 0; x < list.size(); x++) {
            // System.out.println(list.get(x));

            String s = (String) list.get(x);
            System.out.println(s);
        }
    }
}
