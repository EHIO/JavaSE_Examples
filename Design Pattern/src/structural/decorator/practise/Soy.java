package structural.decorator.practise;

/**
 * 具体的装饰者：豆浆
 *
 * @author wg
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
        description = "豆浆";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
//        return description + ", " + beverage.getDescription();
    }
}
