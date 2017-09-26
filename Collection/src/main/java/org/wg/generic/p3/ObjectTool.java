package org.wg.generic.p3;

/*
 * �����ࣺ�ѷ��Ͷ���������
 */
public class ObjectTool<W> {
    private W obj;

    public W getObj() {
        return obj;
    }

    public void setObj(W obj) {
        this.obj = obj;
    }

    /**
     * ��������̬ʱ�����ܷ������϶���ķ��͡������̬����ʹ�÷��ͣ�
     * ֻ�ܽ����Ͷ����ڷ����ϡ�
     *
     * @param obj
     */
    public static <T> void method(T obj) {
        System.out.println("method:" + obj);
    }
}
