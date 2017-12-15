package structural.decorator.starbuzz;

/**
 * 饮料
 *
 * @author wg
 */
public abstract class Beverage {
    String description = "未知饮料";

    public String getDescription() {
        return description;
    }

    /**
     * 计算价钱
     * @return
     */
    public abstract double cost();
}
