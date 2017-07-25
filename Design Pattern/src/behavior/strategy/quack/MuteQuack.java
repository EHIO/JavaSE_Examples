package behavior.strategy.quack;
/**
 * 这是叫行为的实现，给不会叫的鸭子用
 * @author Administrator
 *
 */
public class MuteQuack implements QuackBehavior {

	/**
	 * 实现不会叫的鸭子行为
	 */
	@Override
	public void quack() {
	}

}
