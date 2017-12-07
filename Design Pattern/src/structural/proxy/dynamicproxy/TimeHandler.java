package structural.proxy.dynamicproxy;

import java.lang.reflect.Method;

/**
 * 时间处理器
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method m) {
        long start = System.currentTimeMillis();
        System.out.println("starttime:" + start);
        try {
            m.invoke(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start));
    }

    public static void preRequest() {
        System.out.println("请求前的操作...");
    }

    public static void afterRequest() {
        System.out.println("请求后的操作");
    }

}
