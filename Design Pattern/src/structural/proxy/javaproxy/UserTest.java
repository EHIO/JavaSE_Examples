package structural.proxy.javaproxy;

import java.lang.reflect.Proxy;

public class UserTest {

    public static void main(String[] args) {


        UserService userService = new UserServiceImpl();
        UserInvocationHandler uih = new UserInvocationHandler(userService);

        /*
         * 代理的三大参数
         *  1、目标类的classLoader
         *  2、目标类的实现的所有接口的.class
         *  3、调用处理器
         */
        UserService proxy = (UserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), userService.getClass().getInterfaces(), uih);
//        只有代理对象proxy直接调用的那个方法才是真正的走代理的！
        proxy.test1();
//        proxy.test2();
    }
}
