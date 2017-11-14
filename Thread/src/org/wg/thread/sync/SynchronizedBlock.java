package org.wg.thread.sync;

/**
 * 线程安全问题产生的原因：
 * 1，多个线程在操作共享的数据。
 * 2，操作共享数据的线程代码有多条。
 * 解决思路；
 * 就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候，
 * 其他线程时不可以参与运算的。
 * 必须要当前线程把这些代码都执行完毕后，其他线程才可以参与运算。
 * 同步的好处：解决了线程的安全问题。
 * 同步的弊端：相对降低了效率，因为同步外的线程的都会判断同步锁。
 * 同步的前提：同步中必须有多个线程并使用同一个锁。
 *
 * 同步代码块
 * 同步代码块的锁是任意的对象。
 */
public class SynchronizedBlock {

	public static void main(String[] args) {
		// 创建一个线程任务对象
		Runnable ticket = new Runnable() {
			private int num = 1000;

			private Object obj = new Object();

			@Override
			public void run() {
				while (true) {
					synchronized (obj) {
						if (num > 0) {
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(Thread.currentThread().getName() + "			num=" + num--);
						}
					}
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

/*
class Ticket implements Runnable {

	private int num = 1000;

	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (num > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "			num=" + num--);
				}
			}
		}
	}
}
*/
