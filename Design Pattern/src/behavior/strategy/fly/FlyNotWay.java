package behavior.strategy.fly;
/**
 * 这是飞行行为的实现，给“不会飞的鸭子用”
 * @author Administrator
 *
 */
public class FlyNotWay implements FlyBehavior {

	/**
	 * 实现所有不会飞的鸭子的飞行动作
	 */
	@Override
	public void fly() {
		System.out.println("我不会飞");
	}

}
