package org.wg.collection.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁示例
 */
public class LockDemo {

	public static void main(String[] args) {
		Runnable t = new MyThread();

		new Thread(t).start();
		new Thread(t).start();
	}

	static class MyThread implements Runnable {
		// 创建互斥锁
		private Lock lock = new ReentrantLock();

		@Override
		public void run() {
			// 获取锁
			lock.lock();
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "	" + i);
				}
			} finally {
				// 释放锁
				lock.unlock();
			}
		}
	}
}
