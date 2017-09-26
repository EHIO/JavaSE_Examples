package org.wg.generic.p5;

public class InterDemo {
    public static void main(String[] args) {
        // ��һ������Ĳ���
        // Inter<String> i = new InterImpl();
        // i.show("hello");

        // // �ڶ�������Ĳ���
        Inter<String> i = new InterImpl<String>();
        i.show("hello");

        Inter<Integer> ii = new InterImpl<Integer>();
        ii.show(100);
    }
}
