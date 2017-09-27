package org.wg.generic.p1;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        // ����
        ArrayList<String> array = new ArrayList<String>();

        // ���Ԫ��
        array.add("hello");
        array.add("world");
        array.add("java");
        // array.add(new Integer(100));
        //array.add(10); // JDK5�Ժ���Զ�װ��
        // �ȼ��ڣ�array.add(Integer.valueOf(10));

        // ����
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            // ClassCastException
            // String s = (String) it.next();
            String s = it.next();
            System.out.println(s);
        }

        // �������������
        // String[] strArray = new String[3];
        // strArray[0] = "hello";
        // strArray[1] = "world";
        // strArray[2] = 10;
    }
}
