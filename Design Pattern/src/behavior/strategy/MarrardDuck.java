package behavior.strategy;

import behavior.strategy.fly.FlyWithWings;
import behavior.strategy.quack.Quack;

/**
 * 绿头鸭
 */
public class MarrardDuck extends Duck {

	public MarrardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.err.println("我是绿头鸭");
	}

}
