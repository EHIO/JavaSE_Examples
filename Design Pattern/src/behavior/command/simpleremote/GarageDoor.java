package behavior.command.simpleremote;

/**
 * 车库门：实际接收者
 *
 * @author run
 */
public class GarageDoor {

    public GarageDoor() {
    }

    public void up() {
        System.out.println("车库门向上");
    }

    public void down() {
        System.out.println("车库门向下");
    }

    public void stop() {
        System.out.println("停止车库门");
    }

    public void lightOn() {
        System.out.println("打开车库灯");
    }

    public void lightOff() {
        System.out.println("关闭车库灯");
    }
}
