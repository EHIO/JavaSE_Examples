package behavior.strategy;

import behavior.strategy.fly.FlyWithWings;
import behavior.strategy.quack.Quack;

/**
 * ��ͷѼ
 */
public class MarrardDuck extends Duck {

	public MarrardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("������ͷѼ");
	}

}
