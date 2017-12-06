package structural.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class LogInterceptor implements InvocationHandler {

    // 被代理对象
    private Object target;

    // 织入的代码
    private void beforMethod(Method method) {
        System.out.println(method.getName() + " start " + new Date());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 先执行织入的代码
        beforMethod(method);
        // 再执行被代理类里的方法
        method.invoke(target, args);
        return null;
    }

    // -------------getter setter-----------------------------------
    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}