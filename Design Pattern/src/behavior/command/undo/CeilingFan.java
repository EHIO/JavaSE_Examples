package behavior.command.undo;

/**
 * 吊扇
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    /**
     * 位置
     */
    String location;
    /**
     * 速度
     */
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    /**
     * ����
     */
    public void high() {
        speed = HIGH;
        System.out.println(location + " 吊扇打到最高档");
    }

    /**
     * ����
     */
    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " 吊扇打到中档");
    }

    /**
     * ����
     */
    public void low() {
        speed = LOW;
        System.out.println(location + " 吊扇打到低档");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " 吊扇关闭");
    }

    public int getSpeed() {
        return speed;
    }
}
