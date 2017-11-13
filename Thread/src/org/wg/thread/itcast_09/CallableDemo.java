package org.wg.thread.itcast_09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ���߳�ʵ�ֵķ�ʽ3��
 *  	A:����һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:�����̳߳ص��߳̿���ִ�У�
 * 			����ִ��Runnable�������Callable���������߳�
 * 			��һ����ʵ��Runnable�ӿڡ�
 * 		C:�������·�������
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:�Ҿ�Ҫ������������?
 *			���ԡ�
 */
public class CallableDemo {
	public static void main(String[] args) {
		//�����̳߳ض���
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		//����ִ��Runnable�������Callable���������߳�
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		
		//����
		pool.shutdown();
	}
}
