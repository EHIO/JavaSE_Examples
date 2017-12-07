package org.wg.thread.error;

/**
 * 错误的加锁
 */
public class BadLockOnInteger implements Runnable {
	public static Integer i = 0;

	static BadLockOnInteger instance = new BadLockOnInteger();

	@Override
	public void run() {
		for (int j = 0; j < 100000; j++) {
			synchronized (i) {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
