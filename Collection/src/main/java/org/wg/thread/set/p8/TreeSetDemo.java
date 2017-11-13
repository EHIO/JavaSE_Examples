package org.wg.thread.set.p8;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
 * 
 * ������
 * 		A:����ѧ����
 * 		B:����һ��TreeSet����
 * 		C:�ִܷӸߵ������ʵ����?		
 * 		D:����¼��5��ѧ����Ϣ
 * 		E:����TreeSet����
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        // ����һ��TreeSet����
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // �ִܷӸߵ���
                int num = s2.getSum() - s1.getSum();
                // �ܷ���ͬ�Ĳ�һ��������ͬ
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                // �ܷ���ͬ�Ĳ�һ��������ͬ
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                // �ܷ���ͬ�Ĳ�һ��Ӣ����ͬ
                int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
                // ��������һ����ͬ��
                int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName())
                        : num4;
                return num5;
            }
        });

        System.out.println("ѧ����Ϣ¼�뿪ʼ");
        // ����¼��5��ѧ����Ϣ
        for (int x = 1; x <= 5; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("�������" + x + "��ѧ��������:");
            String name = sc.nextLine();
            System.out.println("�������" + x + "��ѧ�������ĳɼ�:");
            String chineseString = sc.nextLine();
            System.out.println("�������" + x + "��ѧ������ѧ�ɼ�:");
            String mathString = sc.nextLine();
            System.out.println("�������" + x + "��ѧ����Ӣ��ɼ�:");
            String englishString = sc.nextLine();

            // �����ݷ�װ��ѧ��������
            Student s = new Student();
            s.setName(name);
            s.setChinese(Integer.parseInt(chineseString));
            s.setMath(Integer.parseInt(mathString));
            s.setEnglish(Integer.parseInt(englishString));

            // ��ѧ��������ӵ�����
            ts.add(s);
        }
        System.out.println("ѧ����Ϣ¼�����");

        System.out.println("ѧϰ��Ϣ�Ӹߵ����������£�");
        System.out.println("����\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�");
        // ��������
        for (Student s : ts) {
            System.out.println(s.getName() + "\t" + s.getChinese() + "\t"
                    + s.getMath() + "\t" + s.getEnglish());
        }
    }
}
