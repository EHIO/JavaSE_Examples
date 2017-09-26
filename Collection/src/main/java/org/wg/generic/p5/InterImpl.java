package org.wg.generic.p5;

//ʵ������ʵ�ֽӿڵ�ʱ��
//��һ��������Ѿ�֪������ʲô���͵���

//public class InterImpl implements Inter<String> {
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
// }

//�ڶ������������֪����ʲô���͵�
public class InterImpl<T> implements Inter<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}