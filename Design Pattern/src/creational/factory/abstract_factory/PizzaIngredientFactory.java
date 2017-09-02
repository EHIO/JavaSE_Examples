package creational.factory.abstract_factory;

/**
 * 原料工廠，用於生產製作比薩的原料。例如：麵團、醬料、芝士、肉和蔬菜
 */
public interface PizzaIngredientFactory {
	/**
	 * 生產麵團原料
	 *
	 * @return 面团原料
	 */
	public Dough createDough();

	/**
	 * 生產醬料原料
	 *
	 * @return 醬料原料
	 */
	public Sauce createSauce();

	/**
	 * 生產芝士原料
	 *
	 * @return 芝士原料
	 */
	public Cheese createCheese();

	/**
	 * 生產蔬菜原料
	 *
	 * @return 蔬菜原料
	 */
	public Veggies[] createVeggies();

	/**
	 * 生產意大利香腸原料
	 *
	 * @return 意大利香腸原料
	 */
	public Pepperoni createPepperoni();

	/**
	 * 生產蛤蜊原料
	 *
	 * @return 蛤蜊原料
	 */
	public Clams createClam();
}
