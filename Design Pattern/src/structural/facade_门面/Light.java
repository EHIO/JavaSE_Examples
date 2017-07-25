package structural.facade_门面;

public class Light {
	private String name;
	
	public Light(String name) {
		super();
		this.name = name;
	}

	public void turnOn() {
		System.out.println(name + "开");
	}
	
	public void turnOff() {
		System.out.println(name + "关");
	}
}
