package structural.decorator.practise;

/**
 * 低咖啡因, 具体的饮料，被装饰者
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "低咖啡因";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
