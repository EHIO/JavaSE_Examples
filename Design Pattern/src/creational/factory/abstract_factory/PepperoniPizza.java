package creational.factory.abstract_factory;

/**
 * 意大利香腸
 *
 * @author wg
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
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
