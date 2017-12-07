package org.wg.collection.list.linkedlist;

import java.util.LinkedList;

/**
 * LinkedList�����й��ܣ�
 * 		A:��ӹ���
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B:��ȡ����
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		C:ɾ������
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // �������϶���
        LinkedList link = new LinkedList();

        // ���Ԫ��
        link.add("hello");
        link.add("world");
        link.add("java");

        // public void addFirst(Object e)
        // link.addFirst("javaee");
        // public void addLast(Object e)
        // link.addLast("android");

        // public Object getFirst()
        // System.out.println("getFirst:" + link.getFirst());
        // public Obejct getLast()
        // System.out.println("getLast:" + link.getLast());

        // public Object removeFirst()
        System.out.println("removeFirst:" + link.removeFirst());
        // public Object removeLast()
        System.out.println("removeLast:" + link.removeLast());

        // ���������
        System.out.println("link:" + link);
    }
}
