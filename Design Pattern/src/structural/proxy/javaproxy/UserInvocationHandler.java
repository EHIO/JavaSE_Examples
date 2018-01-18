package structural.proxy.javaproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserInvocationHandler implements InvocationHandler {

    public final static String METHOD_PREFIX = "test";

    Object target;

    public UserInvocationHandler(Object target) {
        this.target = target;
    }

   @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       if (method.getName().startsWith(METHOD_PREFIX)) {
           System.out.println("=====分隔符=====");
       }
        return method.invoke(target, args);
    }
}
