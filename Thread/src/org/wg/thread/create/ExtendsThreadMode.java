package org.wg.thread.create;
/**
 * 创建线程方式一：继承Thread类。
 *
 * 步骤：
 * 	 1，定义一个类继承Thread类。
 * 	 2，覆盖Thread类中的run方法。
 * 	 3，直接创建Thread的子类对象创建线程。
 * 	 4，调用start方法开启线程并调用线程的任务run方法执行。
 */
public class ExtendsThreadMode extends Thread {

	private String name;

	public ExtendsThreadMode(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "...." + i + ".....name=" + Thread.currentThread().getName());
		}
	}



	public static void main(String[] args) {
		ExtendsThreadMode d1 = new ExtendsThreadMode("旺财");
		ExtendsThreadMode d2 = new ExtendsThreadMode("小强");
		d1.start();//开启线程，调用run方法。

		d2.start();
		System.out.println("over....name="+Thread.currentThread().getName());
	}
}
