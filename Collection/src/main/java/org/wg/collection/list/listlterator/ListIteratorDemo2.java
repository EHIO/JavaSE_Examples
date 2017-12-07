package org.wg.collection.list.listlterator;

import java.util.ArrayList;
import java.util.List;

/*
 * ����?
 * 		����һ�����ϣ����£����ʣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�
 * 
 * ConcurrentModificationException:��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣�� 
 * ������ԭ��
 * 		�������������ڼ��϶����ڵģ����жϳɹ��󣬼��ϵ����������Ԫ�أ���������ȴ��֪�������Ծͱ����ˣ������в����޸��쳣��
 * 		��ʵ��������������ǣ�����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�صġ�
 * ��ν����?
 * 		A:����������Ԫ�أ��������޸�Ԫ��
 * 			Ԫ���Ǹ��ڸղŵ�����Ԫ�غ���ġ�
 * 		B:���ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
 * 			Ԫ���������ӵġ�
 */
public class ListIteratorDemo2 {
    public static void main(String[] args) {
        // ����List���϶���
        List list = new ArrayList();
        // ���Ԫ��
        list.add("hello");
        list.add("world");
        list.add("java");

        // ����������
        // Iterator it = list.iterator();
        // while (it.hasNext()) {
        // String s = (String) it.next();
        // if ("world".equals(s)) {
        // list.add("javaee");
        // }
        // }

        // ��ʽ1������������Ԫ�أ��������޸�Ԫ��
        // ��Iterator������ȴû����ӹ��ܣ���������ʹ�����ӽӿ�ListIterator
        // ListIterator lit = list.listIterator();
        // while (lit.hasNext()) {
        // String s = (String) lit.next();
        // if ("world".equals(s)) {
        // lit.add("javaee");
        // }
        // }

        // ��ʽ2�����ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
        for (int x = 0; x < list.size(); x++) {
            String s = (String) list.get(x);
            if ("world".equals(s)) {
                list.add("javaee");
            }
        }

        System.out.println("list:" + list);
    }
}