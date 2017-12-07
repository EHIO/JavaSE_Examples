import org.junit.Test;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	/**
	 * 换行符
	 */
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {
		/*
		 * System:类中的方法和属性都是静态的。
		 * 常见方法：
		 * long currentTimeMillis();获取当前时间的毫秒值。
		 */
		System.out.println("hello-" + LINE_SEPARATOR + " world");
	}

	@Test
	public void testSetProperty() {
		String myclasspath = System.getProperty("myclasspath");
		System.out.println(myclasspath);
		System.setProperty("myclasspath", "c:\\myclass");
		myclasspath = System.getProperty("myclasspath");
		System.err.println(myclasspath);
	}

	@Test
	public void demo_1() {
		/*
		   获取系统的属性信息
		 */
		Properties prop = System.getProperties();

		Set<String> nameSet = prop.stringPropertyNames();

		for (String name : nameSet) {
			String value = prop.getProperty(name);
			System.out.println(name + "=" + value);
		}
	}

	/**
	 * 打印系统信息
	 */
	@Test
	public void testGetProperties() {
		System.getProperties().list(System.out);
	}
}
