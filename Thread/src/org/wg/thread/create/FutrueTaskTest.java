package org.wg.thread.create;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutrueTaskTest {

	public static void main(String[] args) {
		//采用直接启动线程的方法
		System.out.println("main Thread begin at:" + System.nanoTime());

		Future<Integer> result1 = getIntegerFutureTask(new MyFutureTask("1"));

		Future<Integer> result2 = getIntegerFutureTask(new MyFutureTask("2"));

		try {
			Thread.sleep(1000);
			System.out.println("task1返回结果:" + result1.get());
			System.out.println("task2返回结果:" + result2.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println("main Thread finish at:" + System.nanoTime());
	}

	/**
	 * 采用直接启动线程的方法
 	 */
	private static Future<Integer> getIntegerFutureTask(Callable myFutureTask) {
		FutureTask<Integer> result = new FutureTask<>(myFutureTask);
		Thread thread = new Thread(result);
		thread.start();
		return result;
	}


	static class MyFutureTask implements Callable<Integer> {
		private String name;

		public MyFutureTask(String name) {
			this.name = name;
		}

		@Override
		public Integer call() throws Exception {
			System.out.println("task" + name + "开始进行计算");
			Thread.sleep(3000);
			int sum = new Random().nextInt(300);
			int result = 0;
			for (int i = 0; i < sum; i++) {
				result += i;
			}
			return result;
		}
	}
}