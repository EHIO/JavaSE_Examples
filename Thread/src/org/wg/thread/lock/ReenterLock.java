package org.wg.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁的简单示例
 * 与synchronized相比，重入锁有着显示的操作过程， 对逻辑的控制的灵活性要好于synchronized
 * 注意：记得释放锁
 */
public class ReenterLock implements Runnable {
	// 创建重入锁对象
	static ReentrantLock lock = new ReentrantLock();

	static int i = 0;

	@Override
	public void run() {
		for (int j = 0; j < 100000; j++) {
			lock.lock();
			try {
				i++;
			} finally {
				lock.unlock();
			}
		}
	}


	public static void main(String[] args) {
		ReenterLock rl = new ReenterLock();
		Thread t1 = new Thread(rl);
		Thread t2 = new Thread(rl);

		t1.start();
		t2.start();

		try {
			// 主线程会等子线程执行完毕后才会结束
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
