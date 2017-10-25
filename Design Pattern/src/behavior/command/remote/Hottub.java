package behavior.command.remote;

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

	/**
	 *
	 */
	public void bubblesOn() {
		if (on) {
			System.out.println("热水浴缸起泡了!");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("热水浴缸冒泡熄火了");
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
		this.temperature = temperature;
	}

	/**
	 * 加热
	 */
	public void heat() {
		temperature = 105;
		System.out.println("热水浴缸加热到105华氏度");
	}

	/**
	 * 冷却
	 */
	public void cool() {
		temperature = 98;
		System.out.println("热浴盆冷却到98华氏度");
	}

}
