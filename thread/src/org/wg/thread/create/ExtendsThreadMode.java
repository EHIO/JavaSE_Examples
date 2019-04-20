package org.wg.thread.create;

public class ExtendsThreadMode extends Thread {

	private String name;

	public ExtendsThreadMode(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "...." + i);
		}
	}


	public static void main(String[] args) {
		ExtendsThreadMode d1 = new ExtendsThreadMode("旺财");
		ExtendsThreadMode d2 = new ExtendsThreadMode("小强");
		//开启线程，调用run方法。
		d1.start();
		d2.start();
	}
}
