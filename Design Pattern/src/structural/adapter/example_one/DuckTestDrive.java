package structural.adapter.example_one;

public class DuckTestDrive {
	public static void main(String[] args) {
		// 创建一个鸭子
		MallardDuck duck = new MallardDuck();
		// 创建一只火鸡
		WildTurkey turkey = new WildTurkey();
		// 将火鸡包装进一个火鸡适配器中，使它看起来像一只鸭子
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.err.println("看火鸡的表演");
		turkey.gobble();
		turkey.fly();
		System.err.println("看鸭子的表演");
		testDuck(duck);
		System.err.println("看火鸡适配器的功效");
		testDuck(turkeyAdapter);
	}

	/**
	 * 取得一只鸭子，并调用它的方法
	 *
	 * @param duck
	 */
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
