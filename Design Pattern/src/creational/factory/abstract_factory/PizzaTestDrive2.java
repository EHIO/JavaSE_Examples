package creational.factory.abstract_factory;

public class PizzaTestDrive2 {
	public static void main(String[] args) {
		// 首先需要一个纽约比萨店
		PizzaStore nyPizzaStore = new NYPizzaStore();
		// 店有了，开始接受订单了
		nyPizzaStore.orderPizza("cheese");

	}
}
