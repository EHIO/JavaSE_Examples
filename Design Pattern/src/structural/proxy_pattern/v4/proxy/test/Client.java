package structural.proxy_pattern.v4.proxy.test;

import structural.proxy_pattern.v4.proxy.InvocationHandler;
import structural.proxy_pattern.v4.proxy.Proxy;


public class Client {
	public static void main(String[] args) throws Exception {
		UserMgr mgr = new UserMgrImpl();
		InvocationHandler h = new TransactionHandler(mgr);
		//TimeHandler h2 = new TimeHandler(h);
		UserMgr u = (UserMgr)Proxy.newProxyInstance(UserMgr.class,h);
		u.addUser();
	}
}
