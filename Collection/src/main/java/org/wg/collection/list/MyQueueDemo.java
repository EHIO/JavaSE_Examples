package org.wg.collection.list;

/*
 * 请使用LinkedList来模拟一个堆栈或者队列数据结构。
 *
 * 堆栈：先进后出 First In Last Out  FILO
 *
 * 队列：先进先出 First In First Out FIFO
 *
 * 我们应该描述这样一个容器，给使用提供一个容器对象完成这两种结构中的一种。
 */


import java.util.LinkedList;

class MyQueue {
    private LinkedList link;

    public MyQueue() {
        link = new LinkedList();
    }

    public void myAdd(Object obj) {
        link.addLast(obj);
    }

    public Object myGet() {
        return link.removeFirst();
    }

    public boolean isNull() {
        return link.isEmpty();
    }
}

public class MyQueueDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyQueue dl = new MyQueue();

        dl.myAdd("abc1");
        dl.myAdd("abc2");
        dl.myAdd("abc3");
        dl.myAdd("abc4");

        while (!dl.isNull()) {
            System.out.println(dl.myGet());
        }
    }

}
