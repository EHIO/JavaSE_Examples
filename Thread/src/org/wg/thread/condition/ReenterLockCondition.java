package org.wg.thread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition
 */
public class ReenterLockCondition implements Runnable {

	public static ReentrantLock lock = new ReentrantLock();
	public static Condition condition = lock.newCondition();

	@Override
	public void run() {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "拿到锁了");
			condition.await();
			System.out.println("hello world");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ReenterLockCondition rlc = new ReenterLockCondition();
		Thread t = new Thread(rlc, "旺财");
		t.start();

		Thread.sleep(2000);
		lock.lock();
		// signal()调用时要示线程先获得相关的锁
		condition.signal();
		// 释放锁， 谦让给被唤醒的线程
		lock.unlock();
	}
}
