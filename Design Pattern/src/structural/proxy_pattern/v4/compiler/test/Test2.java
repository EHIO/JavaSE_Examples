package structural.proxy_pattern.v4.compiler.test;

import java.lang.reflect.Method;

public class Test2 {
	public static void main(String[] args) {
		Method[] methods = structural.proxy_pattern.v4.proxy.Moveable.class.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}
}
