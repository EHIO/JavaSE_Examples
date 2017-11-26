package structural.facade.hometheater;

/**
 * dvd播放机
 *
 * @author wang.gang
 */
public class DvdPlayer {

    public void on() {
        System.out.println("打开dvd播放机");
    }

    public void play(String movie) {
        System.out.println("播放  " + movie);
    }

    public void stop() {
        System.out.println("ֹͣdvd");
    }

    public void eject() {
        System.out.println("弹出dvd");
    }

    public void off() {
        System.out.println("关闭dvd");
    }

}
