package behavior.command.party;

/**
 * 音响
 */
public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " 音响打开");
    }

    public void off() {
        System.out.println(location + " 音响关闭");
    }

    public void setCD() {
        System.out.println(location + " 音响设置为CD输入");
    }

    public void setDVD() {
        System.out.println(location + " 音响设置为DVD输入");
    }

    public void setRadio() {
        System.out.println(location + " 音响设置为收音机");
    }

    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        System.out.println(location + " 音响音量设置为 " + volume);
    }
}
