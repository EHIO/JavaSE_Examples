package behavior.command.remote;

/**
 * 电灯
 */
public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " 电灯打开");
	}

	public void off() {
		System.out.println(location + " 电灯关闭");
	}
}
