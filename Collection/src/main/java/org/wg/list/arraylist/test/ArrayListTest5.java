package org.wg.list.arraylist.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
 * 
 * ������
 * 		A:��������¼�����ݶ���
 * 		B:����¼��������,���ǲ�֪�����ٸ��������ü��ϴ洢
 * 		C:��0����,����򵥣�ֻҪ����¼���������0���ҾͲ�����¼��������
 * 		D:�Ѽ���ת������
 * 		E:����������
 * 		F:��ȡ�������е����������ֵ
 */
public class ArrayListTest5 {
    public static void main(String[] args) {
        // ��������¼�����ݶ���
        Scanner sc = new Scanner(System.in);

        // ����¼��������,���ǲ�֪�����ٸ��������ü��ϴ洢
        ArrayList<Integer> array = new ArrayList<Integer>();

        // ��0����,����򵥣�ֻҪ����¼���������0���ҾͲ�����¼��������
        while (true) {
            System.out.println("���������ݣ�");
            int number = sc.nextInt();
            if (number != 0) {
                array.add(number);
            } else {
                break;
            }
        }

        // �Ѽ���ת������
        // public <T> T[] toArray(T[] a)
        Integer[] i = new Integer[array.size()];
        // Integer[] ii = array.toArray(i);
        array.toArray(i);
        // System.out.println(i);
        // System.out.println(ii);

        // ����������
        // public static void sort(Object[] a)
        Arrays.sort(i);

        // ��ȡ�������е����������ֵ
        System.out.println("�����ǣ�" + arrayToString(i) + "���ֵ��:"
                + i[i.length - 1]);
    }

    public static String arrayToString(Integer[] i) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int x = 0; x < i.length; x++) {
            if (x == i.length - 1) {
                sb.append(i[x]);
            } else {
                sb.append(i[x]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
