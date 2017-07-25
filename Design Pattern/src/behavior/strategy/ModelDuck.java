package behavior.strategy;

import behavior.strategy.fly.FlyNotWay;
import behavior.strategy.fly.FlyWithWings;
import behavior.strategy.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNotWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("我是模型鸭");
	}

}
