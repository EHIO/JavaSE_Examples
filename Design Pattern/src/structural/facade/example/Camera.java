package structural.facade.example;

public class Camera {
	private String name;
	public Camera(String name) {
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
