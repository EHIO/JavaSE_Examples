package behavior.command.remote;

/**
 * 车库门
 */
public class GarageDoor {
	String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " 车库门上升");
	}

	public void down() {
		System.out.println(location + " 车库门下降");
	}

	public void stop() {
		System.out.println(location + " 车库门停止");
	}

	public void lightOn() {
		System.out.println(location + " 打开车库灯");
	}

	public void lightOff() {
		System.out.println(location + " 关闭车库灯");
	}
}
