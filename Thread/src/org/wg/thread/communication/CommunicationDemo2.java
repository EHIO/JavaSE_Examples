package org.wg.thread.communication;

public class CommunicationDemo2 {

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
					if (r.flag) {
						try {
							r.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (i == 0) {
						r.name = "旺财";
						r.sex = "母";
					} else {
						r.name = "小强";
						r.sex = "公";
					}
					r.flag = true;
					r.notify();

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
					if (!r.flag) {
						try {
							r.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(r.name + "		" + r.sex);
					r.flag = false;
					r.notify();
				}
			}
		}
	}

}






