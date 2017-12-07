package org.wg.collection.thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁申请等待限时示例
 *
 */
public class TimeLock implements Runnable {

	static ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {
		try {
			/*
			tryLock接收的两个参数， 一个表示等待时长， 另一个表示计时单位
			线程在这个锁请求中， 等待3秒， 如果超时， 返回false
			 */
			if (lock.tryLock(3, TimeUnit.SECONDS)) {
				System.out.println(Thread.currentThread().getName() + "拿到锁啦");
				Thread.sleep(3000);
			} else {
				System.out.println("获取锁失败");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}

	public static void main(String[] args) {
		TimeLock timeLock = new TimeLock();
		Thread t1 = new Thread(timeLock);
		Thread t2 = new Thread(timeLock);

		t1.start();
		t2.start();
	}
}
