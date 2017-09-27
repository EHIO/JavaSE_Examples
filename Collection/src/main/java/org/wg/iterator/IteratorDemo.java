package org.wg.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello");
        c.add("world");
        c.add("java");

        iterator(c);
        iterator2(c);
    }

    public static void iterator(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }

    public static void iterator2(Collection c) {
        Object obj;
        for (Iterator iterator = c.iterator(); iterator.hasNext();) {
            obj = iterator.next();
            System.out.println(obj);
        }
    }
}
