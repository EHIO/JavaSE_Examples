package creational.factory.simple_factory.example_1;

/**
 * 芝士匹萨
 *
 * @author wang.gang
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "芝士匹萨";
        dough = "常规的壳";
        sauce = "比萨酱沙司";
        toppings.add("新鲜的奶酪");
        toppings.add("帕尔马干酪");
    }
}
