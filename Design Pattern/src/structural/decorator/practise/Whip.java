package structural.decorator.practise;

/**
 * 具体的装饰者：奶泡
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
        description = "奶泡";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
//        return description + ", " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
