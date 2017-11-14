package org.wg.thread.mode;

public class Thread1 extends Thread {

	private String name;

	public Thread1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "...." + i + ".....name=" + Thread.currentThread().getName());
		}
	}
}
