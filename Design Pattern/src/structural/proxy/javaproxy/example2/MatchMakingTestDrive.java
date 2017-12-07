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
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("无法从所有者代理设置评级");
		}
		System.out.println("等级评定： " + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("名字: " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("保龄球");
		} catch (Exception e) {
			System.out.println("无法从所有者代理设置评级");
		}
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
		joe.setInterests("车, 电脑, 音乐");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("小强");
		kelly.setInterests("网上购物, 电影, 音乐");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
}
