package org.wg.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TryLock implements Runnable {
	static ReentrantLock lock1 = new ReentrantLock();
	static ReentrantLock lock2 = new ReentrantLock();

	int i ;

	@Override
	public void run() {

	}
}
