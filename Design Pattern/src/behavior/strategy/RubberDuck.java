package behavior.strategy;

import behavior.strategy.fly.FlyNotWay;
import behavior.strategy.quack.Squeak;

/**
 * ��ƤѼ
 * @author Administrator
 *
 */
public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNotWay();
		quackBehavior = new Squeak();
	}
	@Override
	public void display() {
		System.out.println("����һֻ��в���ɵ���ƤѼ");
	}

}
