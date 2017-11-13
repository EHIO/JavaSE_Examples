package org.wg.thread.itcast_04;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (x % 2 == 0) {
					s.name = "东邪";
					s.age = 27;
				} else {
					s.name = "西毒";
					s.age = 30;
				}
				x++;
			}
		}
	}
}
