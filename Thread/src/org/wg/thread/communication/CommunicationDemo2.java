package org.wg.thread.communication;


/**
 * 等待/唤醒机制。
 * 涉及的方法：
 * 1，wait(): 让线程处于冻结状态，被wait的线程会被存储到线程池中。
 * 2，notify():唤醒线程池中一个线程(任意).
 * 3，notifyAll():唤醒线程池中的所有线程。
 * <p>
 * 这些方法都必须定义在同步中。
 * 因为这些方法是用于操作线程状态的方法。
 * 必须要明确到底操作的是哪个锁上的线程。
 * 为什么操作线程的方法wait notify notifyAll定义在了Object类中？
 * 因为这些方法是监视器的方法。监视器其实就是锁。
 * 锁可以是任意的对象，任意的对象调用的方式一定定义在Object类中。
 */
public class CommunicationDemo2 {

	public static void main(String[] args) {
		// 创建资源对象
		Resource r = new Resource();

		Runnable input = new Input(r);
		Runnable output = new Output(r);

		Thread t1 = new Thread(input);
		Thread t2 = new Thread(output);

		t1.start();
		t2.start();
	}

	/**
	 * 资源对象
	 */
	static class Resource {
		String name;
		String sex;
		boolean flag = false;
	}


	static class Input implements Runnable {
		Resource r;

		public Input(Resource r) {
			this.r = r;
		}

		@Override
		public void run() {
			int i = 0;
			while (true) {
				synchronized (r) {
					if (r.flag) {
						try {
							r.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (i == 0) {
						r.name = "旺财";
						r.sex = "母";
					} else {
						r.name = "小强";
						r.sex = "公";
					}
					r.flag = true;
					r.notify();

				}
				i = (i + 1) % 2;
			}
		}
	}

	static class Output implements Runnable {

		Resource r;

		public Output(Resource r) {
			this.r = r;
		}

		@Override
		public void run() {
			while (true) {
				synchronized (r) {
					if (!r.flag) {
						try {
							r.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(r.name + "		" + r.sex);
					r.flag = false;
					r.notify();
				}
			}
		}
	}

}






