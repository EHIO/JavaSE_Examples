package org.wg.toolclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections:����Լ��Ͻ��в����Ĺ����࣬���Ǿ�̬������
 * 
 * �����⣺
 * Collection��Collections������?
 * Collection:�ǵ��м��ϵĶ���ӿڣ����ӽӿ�List��Set��
 * Collections:����Լ��ϲ����Ĺ����࣬�жԼ��Ͻ�������Ͷ��ֲ��ҵķ���
 * 
 * Ҫ֪���ķ���
 * public static <T> void sort(List<T> list)������ Ĭ�����������Ȼ˳��
 * public static <T> int binarySearch(List<?> list,T key):���ֲ���
 * public static <T> T max(Collection<?> coll):���ֵ
 * public static void reverse(List<?> list):��ת
 * public static void shuffle(List<?> list):����û�
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        // �������϶���
        List<Integer> list = new ArrayList<Integer>();

        // ���Ԫ��
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println("list:" + list);

        // public static <T> void sort(List<T> list)������ Ĭ�����������Ȼ˳��
        // Collections.sort(list);
        // System.out.println("list:" + list);
        // [10, 20, 30, 40, 50]

        // public static <T> int binarySearch(List<?> list,T key):���ֲ���
        // System.out
        // .println("binarySearch:" + Collections.binarySearch(list, 30));
        // System.out.println("binarySearch:"
        // + Collections.binarySearch(list, 300));

        // public static <T> T max(Collection<?> coll):���ֵ
        // System.out.println("max:"+Collections.max(list));

        // public static void reverse(List<?> list):��ת
        // Collections.reverse(list);
        // System.out.println("list:" + list);

        //public static void shuffle(List<?> list):����û�
        Collections.shuffle(list);
        System.out.println("list:" + list);
    }
}
