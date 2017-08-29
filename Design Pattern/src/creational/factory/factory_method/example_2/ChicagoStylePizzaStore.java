package creational.factory.factory_method.example_2;

/**
 * 芝加哥风味的比萨商店
 * 一个具体的创建者
 *
 * @author gang.wang
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoniPizza")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }

}
