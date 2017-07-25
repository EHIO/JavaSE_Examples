package structural.facade_门面;

public class SecurityFacade {
	private Light light = new Light("阿拉丁神灯");
	private Camera camera = new Camera("遗像录像机");
	
	public void on() {
		light.turnOn();
		camera.turnOn();
	}
	
	public void off() {
		light.turnOff();
		camera.turnOff();
	}
}
