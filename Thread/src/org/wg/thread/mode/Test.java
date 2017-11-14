package org.wg.thread.mode;

/**
 * 创建线程方式一：继承Thread类。
 *
 * 步骤：
 * 	 1，定义一个类继承Thread类。
 * 	 2，覆盖Thread类中的run方法。
 * 	 3，直接创建Thread的子类对象创建线程。
 * 	 4，调用start方法开启线程并调用线程的任务run方法执行。
 */
public class Test {

	public static void main(String[] args) {
		Thread1 d1 = new Thread1("旺财");
		Thread1 d2 = new Thread1("小强");
		d1.start();//开启线程，调用run方法。

		d2.start();
		System.out.println("over....name="+Thread.currentThread().getName());
	}
}
