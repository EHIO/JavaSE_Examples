package org.wg.thread.error;

import java.util.ArrayList;

public class ArrayListMultThread {

	static ArrayList<Integer> al = new ArrayList<>();

	// 创建线程安全的集合， 可以避免问题
//	static List<Integer> al = Collections.synchronizedList(new ArrayList<Integer>());

	static class AddThread implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				al.add(i);
			}
		}
	}

	public static void main(String[] args) {
		AddThread at = new AddThread();

		Thread t1 = new Thread(at);
		Thread t2 = new Thread(at);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(al.size());
	}

}
