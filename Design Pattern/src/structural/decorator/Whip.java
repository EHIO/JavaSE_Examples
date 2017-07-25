package structural.decorator;

/**
 * 奶泡，具体的装饰者类
 *
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + " , Whip";
	}

	@Override
	public double cost() {

		return 0.10 + beverage.cost();
	}

}
