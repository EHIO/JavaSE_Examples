package org.wg.generic.p3;

/*
 * ������Ĳ���
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
        // ObjectTool ot = new ObjectTool();
        //
        // ot.setObj(new String("������"));
        // String s = (String) ot.getObj();
        // System.out.println("�����ǣ�" + s);
        //
        // ot.setObj(new Integer(30));
        // Integer i = (Integer) ot.getObj();
        // System.out.println("�����ǣ�" + i);

        // ot.setObj(new String("����ϼ"));
        // // ClassCastException
        // Integer ii = (Integer) ot.getObj();
        // System.out.println("�����ǣ�" + ii);

        System.out.println("-------------");

        ObjectTool<String> ot = new ObjectTool<String>();
        // ot.setObj(new Integer(27)); //���ʱ������ڼ�͹���ȥ
        ot.setObj(new String("����ϼ"));
        String s = ot.getObj();
        System.out.println("�����ǣ�" + s);

        ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
        // ot2.setObj(new String("������"));//���ʱ������ڼ�͹���ȥ
        ot2.setObj(new Integer(27));
        Integer i = ot2.getObj();
        System.out.println("�����ǣ�" + i);
    }
}
