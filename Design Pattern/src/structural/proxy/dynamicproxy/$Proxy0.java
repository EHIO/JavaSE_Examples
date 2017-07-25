package structural.proxy.dynamicproxy;
import java.lang.reflect.Method;

public class $Proxy0 implements proxy.dynamicproxy.Moveable {
    public $Proxy0(InvocationHandler h) {
        this.h = h;
    }
	 proxy.dynamicproxy.InvocationHandler h;
	 @Override
public void move() {
    try {
    Method md = proxy.dynamicproxy.Moveable.class.getMethod("move");
    h.invoke(this, md);
    }catch(Exception e) {e.printStackTrace();}
}
}