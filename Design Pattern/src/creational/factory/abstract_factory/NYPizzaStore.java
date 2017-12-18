package creational.factory.abstract_factory;

/**
 * 紐約風味的比薩商店
 *
 * @author wang.gang
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("紐約樣式的芝士比薩！ ");
        } else if (type.equals("pepperoniPizza")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("紐約樣式的意大利香肠比薩！ ");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("紐約樣式的蛤蜊比薩！ ");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("紐約樣式的素食比薩！ ");
        }
        return pizza;
    }

}
