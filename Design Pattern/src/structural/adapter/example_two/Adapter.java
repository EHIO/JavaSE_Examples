package structural.adapter.example_two;

/**
 * �������࣬�̳��˱������࣬ͬʱʵ�ֱ�׼�ӿ�  
 * (��������)
 * @author gang.wang
 *
 */
class Adapter extends Adaptee implements Target {
	public void request() {
		super.specificRequest();
	}
}