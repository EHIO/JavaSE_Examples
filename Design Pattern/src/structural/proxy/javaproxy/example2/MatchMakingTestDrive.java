package structural.proxy.javaproxy.example2;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
    HashMap<String, PersonBean> datingDB = new HashMap<>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive() {
        PersonBean joe = getPersonFromDatabase("旺财");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("名字：" + ownerProxy.getName());
        ownerProxy.setInterests("保龄球");
        System.out.println("从所有者代理中设置的兴趣");
        try {
            // 无法对自己进行评级
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("无法从所有者代理设置评级");
        }
        System.out.println("等级评定： " + ownerProxy.getHotOrNotRating());
        System.err.println("***********************分阶线***********************");
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("名字: " + nonOwnerProxy.getName());
        try {
            // 无法修改别人的信息
            nonOwnerProxy.setInterests("保龄球");
        } catch (Exception e) {
            System.out.println("无法从非所有者代理设置信息");
        }
        // 可以对别人进行评级
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("由非所有者代理设置的评级");
        System.out.println("等级评定: " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getOwnerProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    PersonBean getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("旺财");
        joe.setInterests("车");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);
    }
}
