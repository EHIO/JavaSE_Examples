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
public class TimerDemo {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();
		// 3���ִ�б�ը����
		// t.schedule(new MyTask(), 3000);
		//��������
		t.schedule(new MyTask(t), 3000);
	}
}

// ��һ������
class MyTask extends TimerTask {

	private Timer t;
	
	public MyTask(){}
	
	public MyTask(Timer t){
		this.t = t;
	}
	
	@Override
	public void run() {
		System.out.println("beng,��ը��");
		t.cancel();
	}

}