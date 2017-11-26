package structural.facade.example;

/**
 * 灯光
 * 子系统组件
 */
public class Light {
    private String name;

    public Light(String name) {
        super();
        this.name = name;
    }

    /**
     * 开启
     */
    public void turnOn() {
        System.out.println(name + "开");
    }

    /**
     * 关闭
     */
    public void turnOff() {
        System.out.println(name + "关");
    }
}
