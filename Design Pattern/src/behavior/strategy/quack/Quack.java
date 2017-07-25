package behavior.strategy.quack;
/**
 * 这是叫行为的实现，给咕咕叫的鸭子用
 * @author Administrator
 *
 */
public class Quack implements QuackBehavior {

	/**
	 * 实现咕咕叫的鸭子行为
	 */
	@Override
	public void quack() {
		System.err.println("咕咕叫");
	}

}
