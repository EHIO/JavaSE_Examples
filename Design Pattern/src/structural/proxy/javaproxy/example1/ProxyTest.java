package structural.proxy.javaproxy.example1;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        // 被代理对象
        UserDao userDao = new UserDaoImpl();
        // 织入代码的类
        LogInterceptor li = new LogInterceptor();
        li.setTarget(userDao);
        // 得到代理对象..注意这里的第一个参数 要和userDao是同一个类加载器
        // 第二个参数是实现哪个接口，要和被代理实现同样的接口
        // 第三个参数是织入的类，该类实现了InvocationHandle接口
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                new Class[]{UserDao.class},
                li);
        userDaoProxy.save(new User());

        // 代理类的名字
        System.out.println(userDaoProxy.getClass().getName());
    }

}