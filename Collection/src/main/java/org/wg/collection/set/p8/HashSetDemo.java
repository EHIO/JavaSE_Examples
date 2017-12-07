package org.wg.collection.set.p8;

import java.util.HashSet;
import java.util.Random;

/*
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 * 
 * ������
 * 		A:�������������
 * 		B:����һ��HashSet����
 * 		C:�жϼ��ϵĳ����ǲ���С��10
 * 			�ǣ��ʹ���һ����������
 * 			�񣺲�������
 * 		D:����HashSet����
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // �������������
        Random r = new Random();

        // ����һ��Set����
        HashSet<Integer> ts = new HashSet<Integer>();

        // �жϼ��ϵĳ����ǲ���С��10
        while (ts.size() < 10) {
            int num = r.nextInt(20) + 1;
            ts.add(num);
        }

        // ����Set����
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
