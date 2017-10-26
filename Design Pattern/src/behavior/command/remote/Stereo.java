package behavior.command.remote;

/**
 * 立体声系统
 */
public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " 立体声系统打开");
    }

    public void off() {
        System.out.println(location + " 立体声系统关闭");
    }

    public void setCD() {
        System.out.println(location + " 立体声设置为CD输入");
    }

    public void setDVD() {
        System.out.println(location + " 立体声设置为DVD输入");
    }

    public void setRadio() {
        System.out.println(location + " 立体声设置收音机");
    }

    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        System.out.println(location + " 立体声音量设置为： " + volume);
    }
}
