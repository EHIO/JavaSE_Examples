package behavior.templatemethod.simplebarista;

/**
 * 咖啡
 */
public class Coffee {

	/**
	 * 准备
	 */
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	/**
	 * 煮开水
	 */
	public void boilWater() {
		System.out.println("煮开水");
	}

	/**
	 * 冲泡咖啡
	 */
	public void brewCoffeeGrinds() {
		System.out.println("冲泡咖啡");
	}

	/**
	 * 倒入杯中
	 */
	public void pourInCup() {
		System.out.println("倒入杯中");
	}

	/**
	 * 加糖和牛奶
	 */
	public void addSugarAndMilk() {
		System.out.println("加糖和牛奶");
	}
}
