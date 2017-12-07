package org.wg.thread.create;

/**
 * 创建线程的第二种方式：实现Runnable接口。
 * 1,定义类实现Runnable接口。
 * 2，覆盖接口中的run方法，将线程的任务代码封装到run方法中。
 * 3，通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数进行传递。
 * 为什么？因为线程的任务都封装在Runnable接口子类对象的run方法中。
 * 所以要在线程对象创建时就必须明确要运行的任务。
 * 4，调用线程对象的start方法开启线程。
 */
public class RunnableModeDemo implements Runnable {
	private String name;

	public RunnableModeDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "......" + i);
			try {
				Thread.sleep((int) Math.random() * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
		new Thread(new RunnableModeDemo("旺财")).start();
		new Thread(new RunnableModeDemo("小强")).start();
		System.out.println("over ...... " + Thread.currentThread().getName());
	}
}



