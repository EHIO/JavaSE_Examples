package creational.factory.abstract_factory;

/**
 * ֥ʿ���_
 */
public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	// Ҫ�u�����_����Ҫ���S�ṩԭ�ϡ�����ÿ�����_���Ҫ�Ę����������еõ�һ�����S���K�ѹ��S�惦��һ������׃����
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
