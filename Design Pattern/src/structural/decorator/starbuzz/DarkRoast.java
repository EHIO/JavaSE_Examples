package structural.decorator.starbuzz;

/**
 * 深焙咖啡, 被装饰的组件
 *
 * @author wg
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "深焙咖啡";
    }

    @Override
    public double cost() {

        return 0.99;
    }

}
