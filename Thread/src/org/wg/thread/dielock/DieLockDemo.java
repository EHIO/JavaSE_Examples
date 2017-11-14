package org.wg.thread.dielock;

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

	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			while(true) {
				synchronized (MyLock.objA) {
					System.out.println(Thread.currentThread().getName()+"......if objA");
					synchronized (MyLock.objB) {
						System.out.println(Thread.currentThread().getName()+"......if objB");
					}
				}
			}
		} else {
			while(true) {
				synchronized (MyLock.objB) {
					System.out.println(Thread.currentThread().getName()+"......else objB");
					synchronized (MyLock.objA) {
						System.out.println(Thread.currentThread().getName()+"......else objA");
					}
				}
			}
		}
	}
}

class MyLock {

	public static final Object objA = new Object();
	public static final Object objB = new Object();
}

