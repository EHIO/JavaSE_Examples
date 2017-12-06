package structural.proxy.staticproxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        Subject sub = new ProxySubject();
        sub.request();
    }
}
