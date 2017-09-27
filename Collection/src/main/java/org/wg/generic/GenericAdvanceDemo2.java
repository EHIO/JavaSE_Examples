package org.wg.generic;


import org.wg.entity.Student;
import org.wg.set.treeset.test.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericAdvanceDemo2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Person> al = new ArrayList<Person>();

        al.add(new Person("abc", 30));
        al.add(new Person("abc4", 34));

        ArrayList<Student> al2 = new ArrayList<Student>();

        al2.add(new Student("stu1", 11));
        al2.add(new Student("stu2", 22));
        ArrayList<String> al3 = new ArrayList<String>();

        al3.add("stu3331");
        al3.add("stu33332");

        printCollection(al2);
        printCollection(al);
    }

    public static void printCollection(Collection<? super Student> al) {
        Iterator<? super Student> it = al.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }

}
