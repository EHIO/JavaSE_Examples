package structural.decorator.practise;

/**
 * 饮料
 *
 * @author wg
 */
public abstract class Beverage {

    String description = "未知饮料";

    public abstract double cost();

    /**
     * 饮料描述
     * @return
     */
    public String getDescription() {
        return description;
    }
}
