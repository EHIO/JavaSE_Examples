package creational.factory.abstract_factory;

/**
 * 芝士比薩
 */
public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	// 要製作比薩，需要工廠提供原料。所以每個比薩類都需要從構造器參數中得倒一個工廠，並把工廠存儲到一個實例變量中
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
