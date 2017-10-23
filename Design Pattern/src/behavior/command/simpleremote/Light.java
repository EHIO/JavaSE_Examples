package behavior.command.simpleremote;

/**
 * 电灯：实际接收者
 * @author run
 */
public class Light {

	public Light() {
	}

	public void on() {
		System.out.println("打开电灯");
	}

	public void off() {
		System.out.println("关闭电灯");
	}
}
