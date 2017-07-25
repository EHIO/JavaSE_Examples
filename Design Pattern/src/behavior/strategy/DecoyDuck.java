package behavior.strategy;

import behavior.strategy.fly.FlyNotWay;
import behavior.strategy.quack.MuteQuack;

/**
 * �ն�Ѽ
 * @author Administrator
 *
 */
public class DecoyDuck extends Duck {
	public DecoyDuck() {
	   flyBehavior = new FlyNotWay();
	   quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
	}
}
