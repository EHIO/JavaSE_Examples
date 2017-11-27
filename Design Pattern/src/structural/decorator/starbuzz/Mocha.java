package structural.decorator.starbuzz;

/**
 * 摩卡，具体的装饰者
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.description = "摩卡";
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ",  " + description;
    }

    @Override
    public double cost() {

        return 0.2 + beverage.cost();
    }

}
