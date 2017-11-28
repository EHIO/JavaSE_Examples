package org.wg.thread.create;

import java.util.Random;
import java.util.concurrent.*;

public class FutureDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main Thread begin at:" + System.nanoTime());
		// 创建线程池
		ExecutorService executor = Executors.newCachedThreadPool();

		Callable handleCallable = new Callable() {

			@Override
			public Object call() throws Exception {
				System.out.println(Thread.currentThread().getName() + "	开始进行计算");
				Thread.sleep(3000);
				int sum = new Random().nextInt(300);
				int result = 0;
				for (int i = 0; i < sum; i++) {
					result += i;
				}
				return result;
			}
		};

		Future<Integer> result1 = executor.submit(handleCallable);
		Future<Integer> result2 = executor.submit(handleCallable);
		Future<Integer> result3 = executor.submit(handleCallable);
		executor.shutdown();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			System.out.println("task1运行结果:" + result1.get());
			System.out.println("task2运行结果:" + result2.get());
			System.out.println("task3运行结果:" + result3.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("main Thread finish at:" + System.nanoTime());
	}
}
