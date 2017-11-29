package org.wg.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TryLock implements Runnable {
	static ReentrantLock lock1 = new ReentrantLock();
	static ReentrantLock lock2 = new ReentrantLock();

	int i;

	public TryLock(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		if (i == 1) {
			while (true) {
				if (lock1.tryLock()) {
					System.out.println(Thread.currentThread().getName() + "...if...:拿到lock1锁了");
					try {
						Thread.sleep(500);
						if (lock2.tryLock()) {
							System.out.println(Thread.currentThread().getName() + "...if...:拿到lock2锁了");
							try {
								System.out.println(Thread.currentThread().getName() + "...if...我的任务跑完了");
								return;
							} finally {
								lock2.unlock();
							}
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						lock1.unlock();
					}
				}
			}
		} else {
			while (true) {
				if (lock2.tryLock()) {
					System.out.println(Thread.currentThread().getName() + "...else...:拿到lock2锁了");
					try {
						Thread.sleep(500);
						if (lock1.tryLock()) {
							System.out.println(Thread.currentThread().getName() + "...else...:拿到lock1锁了");
							try {
								System.out.println(Thread.currentThread().getName() + "...else...我的任务跑完了");
								return;
							} finally {
								lock1.unlock();
							}
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						lock2.unlock();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		TryLock r1 = new TryLock(1);
		TryLock r2 = new TryLock(2);

		Thread t1 = new Thread(r1, "旺财");
		Thread t2 = new Thread(r2, "小强");

		t1.start();
		t2.start();
	}
}
