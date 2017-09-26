package org.wg.list.arraylist.test;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��ȡ10��1-20֮����������Ҫ�����ظ�
 * 
 * ������ʵ�֣���������ĳ����ǹ̶��ģ����Ȳ���ȷ����
 * ��������ʹ�ü���ʵ�֡�
 * 
 * ������
 * 		A:��������������Ķ���
 * 		B:����һ���洢������ļ��ϡ�
 * 		C:����һ��ͳ�Ʊ�������0��ʼ��
 * 		D:�ж�ͳ�Ʊ����Ƿ�С��10
 * 			��:�Ȳ���һ����������жϸ�������ڼ������Ƿ���ڡ�
 * 					���������:����ӣ�ͳ�Ʊ���++��
 * 					�������:�Ͳ���������
 * 			�񣺲�������
 * 		E:��������
 */
public class RandomDemo {
    public static void main(String[] args) {
        // ��������������Ķ���
        Random r = new Random();

        // ����һ���洢������ļ��ϡ�
        ArrayList<Integer> array = new ArrayList<Integer>();

        // ����һ��ͳ�Ʊ�������0��ʼ��
        int count = 0;

        // �ж�ͳ�Ʊ����Ƿ�С��10
        while (count < 10) {
            //�Ȳ���һ�������
            int number = r.nextInt(20) + 1;

            //�жϸ�������ڼ������Ƿ���ڡ�
            if (!array.contains(number)) {
                //���������:����ӣ�ͳ�Ʊ���++��
                array.add(number);
                count++;
            }
        }

        //��������
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
