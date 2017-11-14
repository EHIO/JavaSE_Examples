package org.wg.thread.sync;

/**
 * 同步函数
 *
 * 同步函数的使用的锁是this；
 * 同步函数和同步代码块的区别：
 * 同步函数的锁是固定的this。
 * 同步代码块的锁是任意的对象。
 * 建议使用同步代码块。
 *
 */
public class SynchronizedMethod {

	public static void main(String[] args) {
		Runnable ticket = new Runnable() {

			private int num = 1000;

			@Override
			public void run() {
				while (true) {
					syncMethod();
				}
			}

			private /*synchronized*/ void syncMethod() {
				if (num > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "				" + num--);
				}
			}
		};

		Thread t1 = new Thread(ticket);
		Thread t2 = new Thread(ticket);
		Thread t3 = new Thread(ticket);
		Thread t4 = new Thread(ticket);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
