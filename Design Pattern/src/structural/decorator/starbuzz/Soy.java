package structural.decorator.starbuzz;

/**
 * 豆浆，具体的装饰者类
 *
 * @author wg
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        description = "豆浆";
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + " , " + description;
    }

    @Override
    public double cost() {

        return 0.15 + beverage.cost();
    }

}
