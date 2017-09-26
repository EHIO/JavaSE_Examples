package org.wg.generic.p1;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�ַ���������
 * 
 * ���ǰ���������д����д������� ���ȷ�����ˡ�
 * Ϊʲô��?
 * 		��Ϊ���ǿ�ʼ�洢��ʱ�򣬴洢��String��Integer�������͵����ݡ�
 * 		���ڱ�����ʱ�����ǰ����Ƕ�����String���ʹ���ģ�����ת�������Ծͱ����ˡ�
 * �����أ����ڱ����ڼ�ȴû�и������ǡ�
 * ���ԣ��Ҿ;��������ƵĲ��á�
 * ����һ�£����ǵ�����
 * 		String[] strArray = new String[3];
 * 		strArray[0] = "hello";
 * 		strArray[1] = "world";
 * 		strArray[2] = 10;
 * ����Ҳģ��������������������ڴ��������ʱ����ȷԪ�ص��������͡������Ͳ������������ˡ�
 * �����ּ�������Ϊ�����͡�
 * 
 * ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ����������͡����������ͣ������͵�������һ���Ĵ��ݡ�
 * ��ʽ��
 * 		<��������>
 * 		�˴�����������ֻ�����������͡�
 * �ô���
 * 		A:������ʱ�ڵ�������ǰ���˱����ڼ�
 * 		B:������ǿ������ת��
 * 		C:�Ż��˳�����ƣ�����˻�ɫ������
 */
public class GenericDemo {
    public static void main(String[] args) {
        // ����
        ArrayList<String> array = new ArrayList<String>();

        // ���Ԫ��
        array.add("hello");
        array.add("world");
        array.add("java");
        // array.add(new Integer(100));
        //array.add(10); // JDK5�Ժ���Զ�װ��
        // �ȼ��ڣ�array.add(Integer.valueOf(10));

        // ����
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            // ClassCastException
            // String s = (String) it.next();
            String s = it.next();
            System.out.println(s);
        }

        // �������������
        // String[] strArray = new String[3];
        // strArray[0] = "hello";
        // strArray[1] = "world";
        // strArray[2] = 10;
    }
}
