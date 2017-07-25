package creational.factory.factory_method;

/**
 * 
 * @author gang.wang
 *
 */
public abstract class PizzaStore {

	/**
	 * 负责处理订单
	 * 
	 * @param type
	 * @return
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	/**
	 * 抽象工厂方法
	 * 
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
}
