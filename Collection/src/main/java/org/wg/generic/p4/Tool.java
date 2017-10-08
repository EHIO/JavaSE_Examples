package org.wg.generic.p4;

public class Tool<QQ> {
    private QQ q;

    public QQ getObject() {
        return q;
    }

    public void setObject(QQ object) {
        this.q = object;
    }

    public <W> void show(W str) {
        System.out.println("show : " + str.toString());
    }

    public void print(QQ str) {
        System.out.println("print : " + str);
    }

    /**
     * 泛型方法
     * @param obj
     * @param <Y>
     */
    public static <Y> void method(Y obj) {
        System.out.println("method:" + obj);
    }
}
