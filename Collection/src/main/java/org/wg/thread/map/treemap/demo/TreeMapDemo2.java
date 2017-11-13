package org.wg.thread.map.treemap.demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap<Student,String>
 * ��:Student
 * ֵ��String
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        // �������϶���
        TreeMap<Student, String> tm = new TreeMap<Student, String>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        // ��Ҫ����
                        int num = s1.getAge() - s2.getAge();
                        // ��Ҫ����
                        int num2 = num == 0 ? s1.getName().compareTo(
                                s2.getName()) : num;
                        return num2;
                    }
                });

        // ����ѧ������
        Student s1 = new Student("�˰�", 30);
        Student s2 = new Student("���»�", 35);
        Student s3 = new Student("�Ʋ���", 33);
        Student s4 = new Student("����", 32);
        Student s5 = new Student("�Ʋ���", 33);

        // �洢Ԫ��
        tm.put(s1, "�γ�");
        tm.put(s2, "Ԫ��");
        tm.put(s3, "����");
        tm.put(s4, "�峯");
        tm.put(s5, "����");

        // ����
        Set<Student> set = tm.keySet();
        for (Student key : set) {
            String value = tm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---"
                    + value);
        }
    }
}
