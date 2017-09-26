package org.wg.generic.p4;

//public class ObjectTool<T> {
//	// public void show(String s) {
//	// System.out.println(s);
//	// }
//	//
//	// public void show(Integer i) {
//	// System.out.println(i);
//	// }
//	//
//	// public void show(Boolean b) {
//	// System.out.println(b);
//	// }
//
//	public void show(T t) {
//		System.out.println(t);
//	}
// }

/*
 * ���ͷ������ѷ��Ͷ����ڷ�����
 */
public class ObjectTool {
    public <T> void show(T t) {
        System.out.println(t);
    }
}