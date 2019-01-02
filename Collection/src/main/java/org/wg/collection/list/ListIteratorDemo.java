package org.wg.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        // ListIterator listIterator()
        ListIterator lit = list.listIterator();
        while (lit.hasPrevious()) {
            String s = (String) lit.previous();
            System.out.println(s);
        }
        System.out.println("-----------------");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println("-----------------");
    }
}
