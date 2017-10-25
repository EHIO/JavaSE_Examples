package behavior.command.remote;

/**
 * 吊扇
 */
public class CeilingFan {
	String location = "";
	int level;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;
 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
		// turns the ceiling fan on to high
		level = HIGH;
		System.out.println(location + " 吊扇打到最高档");
 
	} 

	public void medium() {
		// turns the ceiling fan on to medium
		level = MEDIUM;
		System.out.println(location + " 吊扇打到中档");
	}

	public void low() {
		// turns the ceiling fan on to low
		level = LOW;
		System.out.println(location + " 吊扇打到低档");
	}
 
	public void off() {
		// turns the ceiling fan off
		level = 0;
		System.out.println(location + " 吊扇关闭");
	}
 
	public int getSpeed() {
		return level;
	}
}
