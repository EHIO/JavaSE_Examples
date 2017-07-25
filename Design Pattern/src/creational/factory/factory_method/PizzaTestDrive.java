package creational.factory.factory_method;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("��а����----" + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("��������----" + pizza.getName());
	}
}
