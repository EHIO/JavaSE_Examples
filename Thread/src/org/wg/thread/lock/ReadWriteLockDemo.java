package org.wg.thread.lock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁：可以有效地帮助减少锁竞争， 以提升系统性能
 * 系统中如果读操作次数远远大于写操作， 读写锁可以发挥最大功效
 */
public class ReadWriteLockDemo {
//	private static Lock lock = new ReentrantLock();

	private static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	private static Lock readLock = readWriteLock.readLock();

	private static Lock writeLock = readWriteLock.writeLock();

	int value;

	public Object handleRead(Lock lock) throws InterruptedException {
		try {
			// 模拟读操作， 读操作的耗时越多， 读写锁的优势越明显
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "读操作:" + value);
			Thread.sleep(1000);
			return value;
		} finally {
			lock.unlock();
		}
	}

	public void handleWrite(Lock lock, int index) throws InterruptedException {
		try {
			// 模拟写操作
			lock.lock();
			Thread.sleep(1000);
			value = index;
			System.out.println(Thread.currentThread().getName() + "写操作:" + value);
		} finally {
			lock.unlock();
		}

	}

	public static void main(String[] args) {
		ReadWriteLockDemo demo = new ReadWriteLockDemo();

		// 创建一个读任务
		Runnable readRunnable = new Runnable() {
			@Override
			public void run() {
				try {
					demo.handleRead(readLock);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		// 创建一个写任务
		Runnable writeRunnable = new Runnable() {
			@Override
			public void run() {
				try {
					demo.handleWrite(writeLock, new Random().nextInt());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		for (int i = 18; i < 20; i++) {
			new Thread(writeRunnable).start();
		}

		for (int i = 0; i < 18; i++) {
			new Thread(readRunnable).start();
		}
	}
}
