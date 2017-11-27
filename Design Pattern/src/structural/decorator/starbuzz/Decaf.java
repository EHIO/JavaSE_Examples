package structural.decorator.starbuzz;

/**
 * 低咖啡因, 被装饰的组件
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "低咖啡因";
    }

    @Override
    public double cost() {

        return 1.05;
    }

}
