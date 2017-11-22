package structural.adapter.example_one;

/**
 * 绿头鸭
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("嘎嘎叫");
	}

	@Override
	public void fly() {
		System.out.println("正在飞");
	}

}
