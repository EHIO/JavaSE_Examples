package behavior.command.remote;

/**
 * ����
 * @ClassName: GarageDoor 
 * @Description: TODO(������һ�仰��������������) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-2-15 ����5:47:39
 */
public class GarageDoor {
	String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " garage Door is Up");
	}

	public void down() {
		System.out.println(location + " garage Door is Down");
	}

	public void stop() {
		System.out.println(location + " garage Door is Stopped");
	}

	public void lightOn() {
		System.out.println(location + " garage light is on");
	}

	public void lightOff() {
		System.out.println(location + " garage light is off");
	}
}
