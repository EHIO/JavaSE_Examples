package creational.factory.simple_factory;
/**
 * Ö¥Ê¿Æ¥Èø
 * @author wang.gang
 *
 */
public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
