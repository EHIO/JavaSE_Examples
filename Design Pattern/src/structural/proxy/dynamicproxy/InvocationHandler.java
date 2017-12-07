package structural.proxy.dynamicproxy;

import java.lang.reflect.Method;

/**
 * 调用处理器
 */
public interface InvocationHandler {

    /**
     * 调用
     * @param o
     * @param m
     */
    void invoke(Object o, Method m);
}
