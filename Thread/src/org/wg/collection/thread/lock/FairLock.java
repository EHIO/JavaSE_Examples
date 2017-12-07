package org.wg.collection.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 公平锁演示
 * ReentrantLock(fair)  fair为true时， 表示锁为公平的
 */
public class FairLock implements Runnable {

	public static ReentrantLock failLock = new ReentrantLock(true);

	@Override
	public void run() {
		while (true) {
			try {
				failLock.lock();
				System.out.println(Thread.currentThread().getName() + "：获得锁");
			} finally {
				failLock.unlock();
			}
		}
	}

	public static void main(String[] args) {
		FairLock r1 = new FairLock();
		Thread t1 = new Thread(r1, "旺财");
		Thread t2 = new Thread(r1, "小强");
		t1.start();
		t2.start();
	}
}
