package creational.factory.factory_method;

/**
 * 芝加哥风味的比萨商店
 * 
 * @author gang.wang
 *
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
