package org.wg.thread.itcast_12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ����������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ�����顣
 * ����Timer��TimerTask�������ࣺ
 * Timer:��ʱ
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * TimerTask:����
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();
		// 3���ִ�б�ը�����һ�Σ�������ɹ���ÿ��2���ټ���ը
		t.schedule(new MyTask2(), 3000, 2000);
	}
}

// ��һ������
class MyTask2 extends TimerTask {
	@Override
	public void run() {
		System.out.println("beng,��ը��");
	}
}