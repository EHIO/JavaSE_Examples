package creational.factory.factory_method;

/**
 * 纽约风味的比萨商店
 * 
 * @author gang.wang
 *
 */
public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("pepperoniPizza")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else {
			return null;
		}
	}

}
