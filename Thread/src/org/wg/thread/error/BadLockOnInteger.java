package org.wg.thread.error;

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
	/*	Thread t1 = new Thread(instance);
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
*/

		Integer a = Integer.valueOf(200);
		int b = Integer.valueOf(200);

		Integer c = Integer.parseInt("200");

		System.out.println();
//		System.out.println(a == b);

	}
}
