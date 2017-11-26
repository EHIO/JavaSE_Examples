package behavior.strategy.fly;
/**
 * 不会飞， 给不会飞的鸭子使用
 * @author wg
 */
public class FlyNotWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("我不会飞");
	}

}
