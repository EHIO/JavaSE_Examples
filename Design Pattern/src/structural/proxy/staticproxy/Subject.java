package structural.proxy.staticproxy;

/**
 * 抽象角色(Subject)：定义ProxySubject和RealSubject的共同接口，
 * 这样就可以在使用RealSubject的地方都可以使用Proxy代替了。
 * 
 * @author u
 *
 */
public abstract class Subject {
	abstract public void request();
}
