package org.wg.list.arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * 
 * ������
 * 		A:�������϶���
 * 		B:��Ӷ���ַ���Ԫ��(����������ͬ��)
 * 		C:�����¼���
 * 		D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
 * 		E:�����Ԫ�ص��¼���ȥ�ң�����û��
 * 			�У���������
 * 			û�У�����ӵ��¼���
 * 		F:�����¼���
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // �������϶���
        ArrayList array = new ArrayList();

        // ��Ӷ���ַ���Ԫ��(����������ͬ��)
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("java");
        array.add("world");

        // �����¼���
        ArrayList newArray = new ArrayList();

        // �����ɼ���,��ȡ�õ�ÿһ��Ԫ��
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();

            // �����Ԫ�ص��¼���ȥ�ң�����û��
            if (!newArray.contains(s)) {
                newArray.add(s);
            }
        }

        // �����¼���
        for (int x = 0; x < newArray.size(); x++) {
            String s = (String) newArray.get(x);
            System.out.println(s);
        }
    }
}
