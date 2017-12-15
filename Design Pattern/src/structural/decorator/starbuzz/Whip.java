package structural.decorator.starbuzz;

/**
 * 奶泡，具体的装饰者类
 *
 * @author wg
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.description = "奶泡";
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ",  " + description;
    }

    @Override
    public double cost() {

        return 0.10 + beverage.cost();
    }

}
