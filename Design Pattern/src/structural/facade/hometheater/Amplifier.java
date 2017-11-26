package structural.facade.hometheater;

/**
 * 扩音器
 */
public class Amplifier {

    public void on() {
        System.out.println("打开功效");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("把功效输入设置为DVD");
    }

    public void setVolume(int level) {
        System.out.println("将功效音量调到" + level);
    }

    public void off() {
        System.out.println("关闭功效");
    }

}
