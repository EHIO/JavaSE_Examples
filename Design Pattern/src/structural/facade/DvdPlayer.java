package structural.facade;
/**
 * dvd
 * @author wang.gang
 *
 */
public class DvdPlayer {

	public void on() {
		System.out.println("��dvd");
	}

	public void play(String movie) {
		System.out.println("���ŵ�Ӱ��  " + movie);
	}

	public void stop() {
		System.out.println("ֹͣdvd");
	}

	public void eject() {
		System.out.println("����dvd��");
	}

	public void off() {
		System.out.println("�ر�dvd");
	}

}
