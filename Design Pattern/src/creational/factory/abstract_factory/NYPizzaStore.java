package creational.factory.abstract_factory;

/**
 * �~�s�Lζ�ı��_�̵�
 * 
 * @author wang.gang
 *
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("�~�s��ʽ��֥ʿ���_�� ");
		} else if (type.equals("pepperoniPizza")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("�~�s��ʽ��������㳦���_�� ");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("�~�s��ʽ�ĸ��۱��_�� ");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("�~�s��ʽ����ʳ���_�� ");
		}
		return pizza;
	}

}
