package structural.proxy.dynamicproxy;
import java.lang.reflect.Method;
public class $Proxy0 implements structural.proxy.dynamicproxy.Moveable {
    structural.proxy.dynamicproxy.InvocationHandler h;
    public $Proxy0(InvocationHandler h) {
        this.h = h;
	 }
    @Override
	public void move() {
	    try {
			Method md = structural.proxy.dynamicproxy.Moveable.class.getMethod("move");
			h.invoke(this, md);
		} catch (Exception e) {e.printStackTrace();}
	}
}