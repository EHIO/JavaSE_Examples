package behavior.strategy;

import behavior.strategy.fly.FlyWithWings;
import behavior.strategy.quack.Squeak;

/**
 * ��ͷѼ
 * @author Administrator
 *
 */
public class RedheadDuck extends Duck {

	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}
	@Override
	public void display() {
		System.err.println("����һֻ�����ĺ�ͷѼ");
	}

}
