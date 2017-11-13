package org.wg.thread.iterator;

import org.junit.Test;
import org.wg.thread.entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

 */
public class IteratorDemo {

    @Test
    public void demo1() {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");
        iterator(c);
        iterator2(c);
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

        iterator(array);
        iterator2(array);
    }

    public static void iterator(Collection<?> c) {
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void iterator2(Collection<?> c) {
        Object obj;
        for (Iterator<?> iterator = c.iterator(); iterator.hasNext();) {
            obj = iterator.next();
            System.out.println(obj);
        }
    }
}
