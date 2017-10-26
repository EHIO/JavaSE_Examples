package behavior.command.party;

/**
 * 热水浴缸
 */
public class Hottub {
    boolean on;
    /**
     * 温度
     */
    int temperature;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void circulate() {
        if (on) {
            System.out.println("热水浴缸起泡了!");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("热水浴缸喷射头打开");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("热水浴缸喷射头关闭");
        }
    }

    public void setTemperature(int temperature) {
        if (temperature > this.temperature) {
            System.out.println("热水浴缸加热到 " + temperature + " 度");
        } else {
            System.out.println("热水浴缸冷却到 " + temperature + " 度");
        }
        this.temperature = temperature;
    }
}
