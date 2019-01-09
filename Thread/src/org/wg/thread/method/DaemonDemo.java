package org.wg.thread.method;

import java.util.concurrent.TimeUnit;

/**
 * 守护线程
 */
public class DaemonDemo {

	public static class DaemonT implements Runnable {

		@Override
		public void run() {
			try {
				while (true) {
					System.out.println("hello world!");
					TimeUnit.MILLISECONDS.sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable r = new DaemonT();
		Thread t = new Thread(r);
		// 设置为守护线程， 当用户线程全部都结束后， 守护线程也自然结束
		t.setDaemon(true);
		t.start();

		TimeUnit.SECONDS.sleep(1);
	}
}
