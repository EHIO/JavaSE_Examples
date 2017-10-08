package org.wg.generic.p3;

public class ObjectTool<W> {
    private W obj;

    public W getObj() {
        return obj;
    }

    public void setObj(W obj) {
        this.obj = obj;
    }

    public static <T> void method(T obj) {
        System.out.println("method:" + obj);
    }
}
