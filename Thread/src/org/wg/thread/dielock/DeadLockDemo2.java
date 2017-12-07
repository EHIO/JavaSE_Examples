package org.wg.thread.dielock;

/**
 * 死锁：常见情景之一：同步的嵌套。
 */
public class DeadLockDemo2 {


	public static void main(String[] args) {

		// 创建一个线程任务对象
		Ticket ticket = new Ticket();

		Thread t1 = new Thread(ticket);
		Thread t2 = new Thread(ticket);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		ticket.flag = false;
		t2.start();
	}
}


class Ticket implements Runnable {
	private int num = 1000;

	Object obj = new Object();

	boolean flag = true;

	@Override
	public void run() {
		if (flag) {
			while (true) {
				synchronized (obj) {
					show();
				}
			}
		} else {
			while (true) {
				show();
			}
		}
	}

	private synchronized void show() {
		synchronized (obj) {
			if (num > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "			" + num--);
			}
		}
	}
}