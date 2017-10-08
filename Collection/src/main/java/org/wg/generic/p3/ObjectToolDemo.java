package org.wg.generic.p3;

/*
 * ������Ĳ���
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
        ObjectTool<String> ot = new ObjectTool<String>();
        ot.setObj(new String("hello"));
        String s = ot.getObj();
        System.out.println("s:" + s);

        ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
        ot2.setObj(new Integer(27));
        Integer i = ot2.getObj();
        System.out.println("i:" + i);
    }
}
