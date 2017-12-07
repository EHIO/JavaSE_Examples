package org.wg.collection.thread.communication;


/**
 * 线程间的通信
 * 多个线程在处理同一资源，但是任务却不同。
 */
public class CommunicationDemo {

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
					if (i == 0) {
						r.name = "旺财";
						r.sex = "母";
					} else {
						r.name = "小强";
						r.sex = "公";
					}
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
					System.out.println(r.name + "		" + r.sex);
				}
			}
		}
	}

}






