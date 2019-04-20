package org.wg.thread.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 信号量：允许多个线程同时访问
 * Semaphore(int permits) 创建具有给定的许可数和非公平的公平设置的 Semaphore。
 * Semaphore(int permits, boolean fair) 创建具有给定的许可数和给定的公平设置的 Semaphore。
 * acquire() 从此信号量获取一个许可，在提供一个许可前一直将线程阻塞，否则线程被中断。
 * 			获取一个许可（如果提供了一个）并立即返回，将可用的许可数减 1。
 * acquireUninterruptibly()
 * tryAcquire() 仅在调用时此信号量存在一个可用许可，才从信号量获取许可。
 *     获取一个许可（如果提供了一个）并立即返回，其值为 true，将可用的许可数减 1。
 *     如果没有可用的许可，则此方法立即返回并且值为 false。
 * tryAcquire(int permits, long timeout, TimeUnit unit)
 * release() 释放一个许可，将其返回给信号量。
 */
public class SemapDemo implements Runnable {

	// 申明一个包含5个许可的信号量
	final Semaphore semp = new Semaphore(5);

	@Override
	public void run() {
		try {
			semp.acquire();
			Thread.sleep(200);
			System.out.println(Thread.currentThread().getName() + "完成");
			semp.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 开启20个线程
		ExecutorService exec = Executors.newFixedThreadPool(20);
		final SemapDemo demo = new SemapDemo();
		for (int i = 0; i < 20; i++) {
			exec.submit(demo);
		}
	}
}
