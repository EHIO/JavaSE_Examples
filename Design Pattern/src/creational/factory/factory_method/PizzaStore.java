package creational.factory.factory_method;

/**
 * 
 * @author gang.wang
 *
 */
public abstract class PizzaStore {

	/**
	 * ��������
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
	 * ���󹤳�����
	 * 
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
}
