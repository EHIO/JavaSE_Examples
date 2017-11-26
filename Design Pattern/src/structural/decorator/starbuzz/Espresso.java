package structural.decorator.starbuzz;

/**
 * 浓缩咖啡, 被装饰的组件
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {

        return 1.99;
    }

}
