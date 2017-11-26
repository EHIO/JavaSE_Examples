package structural.facade.example;

/**
 * 外观
 * 意图：简化接口
 */
public class SecurityFacade {
    private Light light;
    private Camera camera;

    public SecurityFacade(Light light, Camera camera) {
        this.light = light;
        this.camera = camera;
    }

    public void on() {
        light.turnOn();
        camera.turnOn();
    }

    public void off() {
        light.turnOff();
        camera.turnOff();
    }
}
