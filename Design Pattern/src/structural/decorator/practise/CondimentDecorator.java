package structural.decorator.practise;

/**
 * 装饰者抽象组件
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public CondimentDecorator() {

    }

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
