package org.wg.list.vector;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector�����й��ܣ�
 * 1����ӹ���
 * 		public void addElement(Object obj)		--	add()
 * 2����ȡ����
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 				boolean hasMoreElements()				hasNext()
 * 				Object nextElement()					next()
 * 
 * JDK������ԭ��
 * 		A:��ȫ
 * 		B:Ч��
 * 		C:����д
 */
public class VectorDemo {
    public static void main(String[] args) {
        // �������϶���
        Vector v = new Vector();

        // ��ӹ���
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");

        // ����
        for (int x = 0; x < v.size(); x++) {
            String s = (String) v.elementAt(x);
            System.out.println(s);
        }

        System.out.println("------------------");

        Enumeration en = v.elements(); // ���ص���ʵ����Ķ���
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }
    }
}
