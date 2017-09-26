package org.wg.list.arraylist.test;

import java.util.ArrayList;


/*
 * ���ϵ�Ƕ�ױ���
 * ����
 * 		���ǰ���ѧ����ÿһ��ѧ���ǲ���һ�������������ǿ���ʹ��һ�����ϱ�ʾ���ǰ༶��ѧ����ArrayList<Student>
 * 		�����أ������Ա��ǲ��ǻ��а༶��ÿ���༶�ǲ���Ҳ��һ��ArrayList<Student>��
 * 		���������ж��ArrayList<Student>��ҲҪ�ü��ϴ洢����ô����?
 * 		����������ӵģ�ArrayList<ArrayList<Student>>
 */
public class ArrayListTest4 {
    public static void main(String[] args) {
        // �����󼯺�
        ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();

        // ������һ���༶��ѧ������
        ArrayList<Student> firstArrayList = new ArrayList<Student>();
        // ����ѧ��
        Student s1 = new Student("��ɮ", 30);
        Student s2 = new Student("�����", 29);
        Student s3 = new Student("��˽�", 28);
        Student s4 = new Student("ɳɮ", 27);
        Student s5 = new Student("������", 26);
        // ѧ������
        firstArrayList.add(s1);
        firstArrayList.add(s2);
        firstArrayList.add(s3);
        firstArrayList.add(s4);
        firstArrayList.add(s5);
        // �ѵ�һ���༶�洢��ѧ��ϵͳ��
        bigArrayList.add(firstArrayList);

        // �����ڶ����༶��ѧ������
        ArrayList<Student> secondArrayList = new ArrayList<Student>();
        // ����ѧ��
        Student s11 = new Student("�����", 30);
        Student s22 = new Student("˾��ܲ", 28);
        Student s33 = new Student("���", 26);
        // ѧ������
        secondArrayList.add(s11);
        secondArrayList.add(s22);
        secondArrayList.add(s33);
        // �ѵڶ����༶�洢��ѧ��ϵͳ��
        bigArrayList.add(secondArrayList);

        // �����������༶��ѧ������
        ArrayList<Student> thirdArrayList = new ArrayList<Student>();
        // ����ѧ��
        Student s111 = new Student("�ν�", 40);
        Student s222 = new Student("����", 35);
        Student s333 = new Student("��ٴ", 30);
        Student s444 = new Student("��ʦʦ", 22);
        // ѧ������
        thirdArrayList.add(s111);
        thirdArrayList.add(s222);
        thirdArrayList.add(s333);
        thirdArrayList.add(s444);
        // �ѵ������༶�洢��ѧ��ϵͳ��
        bigArrayList.add(thirdArrayList);

        // ��������
        for (ArrayList<Student> array : bigArrayList) {
            for (Student s : array) {
                System.out.println(s.getName() + "---" + s.getAge());
            }
        }
    }
}
