package org.wg.generic;


import javafx.concurrent.Worker;
import org.wg.entity.Student;
import org.wg.set.treeset.test.Person;

import java.util.ArrayList;

public class GenericAdvanceDemo3 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Person> al1 = new ArrayList<Person>();

        al1.add(new Person("abc", 30));
        al1.add(new Person("abc4", 34));

        ArrayList<Student> al2 = new ArrayList<Student>();

        al2.add(new Student("stu1", 11));
        al2.add(new Student("stu2", 22));


        ArrayList<Worker> al3 = new ArrayList<Worker>();


        ArrayList<String> al4 = new ArrayList<String>();
        al4.add("abcdeef");

        al1.addAll(al2);

        System.out.println(al1.size());

    }


}

class MyCollection<E> {
    public void add(E e) {

    }

    public void addAll(MyCollection<? extends E> e) {

    }
}
