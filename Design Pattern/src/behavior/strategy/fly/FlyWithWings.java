package behavior.strategy.fly;

/**
 * 这是飞行行为的实现，给“真会飞的鸭子用”
 * @author Administrator
 *
 */
public class FlyWithWings implements FlyBehavior {

	/**
	 * 实现会飞的鸭子的飞行行为
	 */
	@Override
	public void fly() {
		System.err.println("我会飞");
	}

}
