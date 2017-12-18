package creational.factory.abstract_factory;

/**
 * 蛤蜊比薩
 *
 * @author wg
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
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
