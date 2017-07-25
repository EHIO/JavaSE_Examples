package structural.proxy.staticproxy;

/**
 * 代理角色(ProxySubject)：代理对象保存了一个真实引用，从而可以操作真实对象，并提供一个与Subject的接口相同的接口，
 * 从而在任何时刻都能代替真实对象。同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。
 *
 */
public class ProxySubject extends Subject {
	private RealSubject realSubject;

	@Override
	public void request() {
		preRequest();
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
		postRequest();
	}

	public static void preRequest() {
		System.out.println("请求前的操作!");
	}

	public static void postRequest() {
		System.out.println("请求后的操作");
	}
}
