package creational.factory.factory_method;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("东邪点了----" + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("西毒点了----" + pizza.getName());
	}
}
