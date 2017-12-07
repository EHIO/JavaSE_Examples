package org.wg.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁的示例
 */
public class LockDemo2 {

	public static void main(String[] args) {
		Resource r = new Resource();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

	static class Resource {
		private String name;
		private int count = 1;
		private boolean flag = false;

		//	创建一个锁对象。
		Lock lock = new ReentrantLock();

		//通过已有的锁获取两组监视器，一组监视生产者，一组监视消费者。
		Condition producerCon = lock.newCondition();
		Condition consumerCon = lock.newCondition();

		public void set(String name) {    //  t0 t1
			lock.lock();
			try {
				while (flag) {
					try {
						producerCon.await();
					} catch (InterruptedException e) {
					}//   t1    t0s
				}
				this.name = name + count;
				count++;//2 3 4
				System.out.println(Thread.currentThread().getName() + "...生产者5.0..." + this.name);//生产烤鸭1 生产烤鸭2 生产烤鸭3
				flag = true;
				consumerCon.signal();
			} finally {
				lock.unlock();
			}

		}

		public void out() { // t2 t3
			lock.lock();
			try {
				while (!flag) {
					try {
						consumerCon.await();
					} catch (InterruptedException e) {
					}
				}
				System.out.println(Thread.currentThread().getName() + "...消费者.5.0......." + this.name);//消费烤鸭1
				flag = false;
				producerCon.signal();
			} finally {
				lock.unlock();
			}
		}
	}

	/**
	 * 生产者
	 */
	static class Producer implements Runnable {
		private Resource r;

		Producer(Resource r) {
			this.r = r;
		}

		@Override
		public void run() {
			while (true) {
				r.set("烤鸭");
			}
		}
	}

	/**
	 * 消费者
	 */
	static class Consumer implements Runnable {
		private Resource r;

		Consumer(Resource r) {
			this.r = r;
		}

		@Override
		public void run() {
			while (true) {
				r.out();
			}
		}
	}
}
