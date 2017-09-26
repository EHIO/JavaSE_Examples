package org.wg.generic.p1;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ��������Щ�ط�ʹ����?
 * 		��API������࣬�ӿڣ���������������<E>��˵Ҫʹ�÷��͡�һ����˵�����ڼ�����ʹ�á�
 */
public class GenericDemo2 {
    public static void main(String[] args) {
        // ��ArrayList�洢�ַ���Ԫ�أ����������÷��͸Ľ�����
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------");

        for (int x = 0; x < array.size(); x++) {
            String s = array.get(x);
            System.out.println(s);
        }
    }
}
