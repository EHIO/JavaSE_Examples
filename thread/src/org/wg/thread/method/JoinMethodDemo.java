package org.wg.thread.method;

import java.util.concurrent.TimeUnit;

/**
 * join()方法的演示
 */
public class JoinMethodDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " 运行开始!");
		MyThread mythread = new MyThread();
		Thread t1 = new Thread(mythread);
		Thread t2 = new Thread(mythread);
		t1.start();
		t2.start();
		try {
			// 加了join方法后， 主线程会等子线程执行完毕后才会结束
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 运行结束!");
	}

	static class MyThread implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " 运行开始");
			for (int i = 0; i < 5; i++) {
				try {
					TimeUnit.MILLISECONDS.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " 运行结束");
		}
	}
}
