package behavior.strategy.quack;
/**
 * 这是叫行为的实现，给吱吱叫的鸭子用
 * @author Administrator
 *
 */
public class Squeak implements QuackBehavior {

	/**
	 * 实现吱吱叫的鸭子行为
	 */
	@Override
	public void quack() {
		System.out.println("吱吱叫");
	}

}
