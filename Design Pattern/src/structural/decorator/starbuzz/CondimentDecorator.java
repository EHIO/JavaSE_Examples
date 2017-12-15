package structural.decorator.starbuzz;

/**
 * 调料，也就是装饰者类
 *
 * @author wg
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
