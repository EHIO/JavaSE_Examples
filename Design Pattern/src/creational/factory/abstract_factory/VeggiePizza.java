package creational.factory.abstract_factory;

/**
 * 素食比萨
 *
 * @author wg
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super();
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("准备 " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }

}
