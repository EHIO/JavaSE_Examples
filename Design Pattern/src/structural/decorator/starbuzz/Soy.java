package structural.decorator.starbuzz;

/**
 * 豆浆，具体的装饰者类
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + " ,豆浆";
    }

    @Override
    public double cost() {

        return 0.15 + beverage.cost();
    }

}
