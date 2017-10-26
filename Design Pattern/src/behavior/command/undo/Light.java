package behavior.command.undo;

/**
 * 电灯
 */
public class Light {
    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        System.out.println("电灯打开");
    }

    public void off() {
        level = 0;
        System.out.println("电灯关闭");
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            System.out.println("电灯调暗到 " + level + "%");
        }
    }

    public int getLevel() {
        return level;
    }
}
