package org.wg.containers.list;

import java.util.LinkedList;

class MyStack {
    private LinkedList link;

    public MyStack() {
        link = new LinkedList();
    }

    public void add(Object obj) {
        link.addFirst(obj);
    }

    public Object get() {
        // return link.getFirst();
        return link.removeFirst();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }
}


public class MyStackDemo {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.add("hello");
        ms.add("world");
        ms.add("java");

        while (!ms.isEmpty()) {
            System.out.println(ms.get());
        }
    }
}
