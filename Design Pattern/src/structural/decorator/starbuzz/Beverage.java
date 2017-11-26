package structural.decorator.starbuzz;

/**
 * 饮料
 */
public abstract class Beverage {
    String description = "未知饮料";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
