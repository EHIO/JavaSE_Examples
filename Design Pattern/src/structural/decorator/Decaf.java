package structural.decorator;

/**
 * 低咖啡因, 被装饰的组件
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {

		return 1.05;
	}

}
