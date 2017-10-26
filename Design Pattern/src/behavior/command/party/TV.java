package behavior.command.party;

/**
 * 电视
 */
public class TV {
    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " 电视打开");
    }

    public void off() {
        System.out.println(location + " 电视关闭");
    }

    /**
     * 设置输入通道
     */
    public void setInputChannel() {
        this.channel = 3;
        System.out.println(location + " 电视频道被设置为DVD");
    }
}
