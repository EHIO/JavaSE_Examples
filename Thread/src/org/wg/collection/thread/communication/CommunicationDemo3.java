package org.wg.collection.thread.communication;


/**
 *
 */
public class CommunicationDemo3 {

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
		boolean flag = false;

		public synchronized void set(String name, String sex) {
			if (flag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.name = name;
			this.sex = sex;
			flag = true;
			notify();
		}

		public synchronized void get() {
			if (!flag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name + "		" + sex);
			this.flag = false;
			this.notify();
		}
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
				if (i == 0) {
					r.set("旺财", "母");
				} else {
					r.set("小强", "公");
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
				r.get();
			}
		}
	}
}






