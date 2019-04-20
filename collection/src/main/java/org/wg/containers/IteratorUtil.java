package org.wg.containers;

import java.util.Collection;
import java.util.Iterator;

public class IteratorUtil {

    public static void iterator(Collection<?> c) {
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void iterator2(Collection<?> c) {
        Object obj;
        for (Iterator<?> iterator = c.iterator(); iterator.hasNext(); ) {
            obj = iterator.next();
            System.out.println(obj);
        }
    }
}
