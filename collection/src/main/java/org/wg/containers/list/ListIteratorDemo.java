package org.wg.containers.list;

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

        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            System.out.println(s);
        }

        System.out.println("-----------------");
        // 从后住前遍历
        while (lit.hasPrevious()) {
            String s = (String) lit.previous();
            System.out.println(s);
        }
    }
}
