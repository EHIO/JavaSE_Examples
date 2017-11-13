package org.wg.thread.itcast_11;

/*
 * �����ڲ���ĸ�ʽ��
 * 		new �������߽ӿ���() {
 * 			��д����;
 * 		};
 * 		���ʣ��Ǹ�����߽ӿڵ��������
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// �̳�Thread����ʵ�ֶ��߳�
		new Thread() {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ x);
				}
			}
		}.start();

		// ʵ��Runnable�ӿ���ʵ�ֶ��߳�
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ x);
				}
			}
		}) {
		}.start();

		// �����Ѷȵ�
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("hello" + ":" + x);
				}
			}
		}) {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}.start();
	}
}
