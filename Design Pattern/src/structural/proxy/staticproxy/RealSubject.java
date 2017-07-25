package structural.proxy.staticproxy;

/**
 * 真实角色(RealSubject)：定义Proxy所代表的真实对象，是我们最终要引用的对象实体。
 *
 */
public class RealSubject extends Subject {
	public RealSubject() {
	}

	public void request() {
		System.out.println("真实的请求.");
	}

}
