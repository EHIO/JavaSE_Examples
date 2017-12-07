package org.wg.collection.thread.dielock;

/**
 * 死锁示例
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);

		Thread t1 = new Thread(dl1);
		Thread t2 = new Thread(dl2);

		t1.start();
		t2.start();
	}
}

class DieLock implements Runnable {

	public static final Object objA = new Object();
	public static final Object objB = new Object();
	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			while(true) {
				synchronized (objA) {
					System.out.println(Thread.currentThread().getName()+"......if objA");
					synchronized (objB) {
						System.out.println(Thread.currentThread().getName()+"......if objB");
					}
				}
			}
		} else {
			while(true) {
				synchronized (objB) {
					System.out.println(Thread.currentThread().getName()+"......else objB");
					synchronized (objA) {
						System.out.println(Thread.currentThread().getName()+"......else objA");
					}
				}
			}
		}
	}
}