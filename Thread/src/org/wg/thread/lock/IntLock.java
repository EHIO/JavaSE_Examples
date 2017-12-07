package org.wg.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 中断响应
 */
public class IntLock implements Runnable {

	private static ReentrantLock lock1 = new ReentrantLock();
	private static ReentrantLock lock2 = new ReentrantLock();

	int i;

	public IntLock(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		try {
			if (i == 0) {
				lock1.lockInterruptibly();
				System.out.println(Thread.currentThread().getName() + "获得锁");
				Thread.sleep(500);
				lock2.lockInterruptibly();
			} else {
				lock2.lockInterruptibly();
				System.out.println(Thread.currentThread().getName() + "获得锁");
				Thread.sleep(500);
				lock1.lockInterruptibly();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock1.isHeldByCurrentThread()) {
				lock1.unlock();
			}
			if (lock2.isHeldByCurrentThread()) {
				lock2.unlock();
			}
			System.out.println(Thread.currentThread().getName() + ":线程退出！");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		IntLock r1 = new IntLock(1);
		IntLock r2 = new IntLock(2);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

//		Thread.sleep(1000);
		// 中断线程
		t2.interrupt();
	}
}
