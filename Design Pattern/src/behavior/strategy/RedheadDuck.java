package behavior.strategy;

import behavior.strategy.fly.FlyWithWings;
import behavior.strategy.quack.Squeak;

/**
 * 红头鸭

 * @author wg
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.err.println("我是一只忧郁的红头鸭");
    }

}
