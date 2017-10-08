package org.wg.generic.p1;

import org.junit.Test;
import org.wg.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

    @Test
    public void demo() {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }

    @Test
    public void demo2() {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("张三", 40);
        Student s2 = new Student("李四", 30);
        Student s3 = new Student("王五", 26);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
        System.out.println("------------------");

        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
