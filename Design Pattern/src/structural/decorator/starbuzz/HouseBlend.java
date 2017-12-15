package structural.decorator.starbuzz;

/**
 * 综合咖啡, 被装饰的组件
 *
 * @author wg
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "综合咖啡";
    }

    @Override
    public double cost() {

        return 0.89;
    }

}
