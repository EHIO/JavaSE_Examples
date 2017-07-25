package structural.adapter.example_two;

/**
 * 适配器类，继承了被适配类，同时实现标准接口  
 * (类适配器)
 * @author gang.wang
 *
 */
class Adapter extends Adaptee implements Target {
	public void request() {
		super.specificRequest();
	}
}