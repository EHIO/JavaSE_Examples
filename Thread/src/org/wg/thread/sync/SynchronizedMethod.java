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
public class SynchronizedMethod implements Runnable {

	private static int num = 100;

	public static void main(String[] args) {
		Runnable r = new SynchronizedMethod();

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		while (true) {
//			syncMethod();
			staticSyncMethod();
		}
	}

	/**
	 * 同步函数的锁是this。
	 */
	private synchronized void syncMethod() {
		if (num > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "				" + num--);
		}
	}

	/**
	 * 同步静态方法使用的锁是类Class对象
	 */
	private static synchronized void staticSyncMethod() {
		if (num > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "				" + num--);
		}
	}
}
