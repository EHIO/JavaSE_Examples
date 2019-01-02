package org.wg.collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Student2 {
    private String name;
    private int age;

    public Student2() {
        super();
    }

    public Student2(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet<Student2> ts = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                int num = s1.getName().length() - s2.getName().length();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
                return num3;
            }
        });

        Student2 s1 = new Student2("linqingxia", 27);
        Student2 s2 = new Student2("zhangguorong", 29);
        Student2 s3 = new Student2("wanglihong", 23);
        Student2 s4 = new Student2("linqingxia", 27);
        Student2 s5 = new Student2("liushishi", 22);
        Student2 s6 = new Student2("wuqilong", 40);
        Student2 s7 = new Student2("fengqingy", 22);
        Student2 s8 = new Student2("linqingxia", 29);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);

        for (Student2 s : ts) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
