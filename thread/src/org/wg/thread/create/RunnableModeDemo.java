package org.wg.thread.create;

public class RunnableModeDemo implements Runnable {
	private String name;

	public RunnableModeDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "......" + i);
			try {
				Thread.sleep((int) Math.random() * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Thread(new RunnableModeDemo("旺财")).start();
		new Thread(new RunnableModeDemo("小强")).start();
		System.out.println("over ...... " + Thread.currentThread().getName());
	}
}



