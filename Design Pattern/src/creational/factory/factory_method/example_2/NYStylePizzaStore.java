package creational.factory.factory_method.example_2;

/**
 * 纽约风味的比萨商店
 * 一个具体的创建者
 *
 * @author gang.wang
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("pepperoniPizza".equals(type)) {
            return new NYStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            return new NYStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }

}
