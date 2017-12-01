package behavior.templatemethod.simplebarista;

/**
 * 茶
 * @author wg
 */
public class Tea {
 
	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	/**
	 * 烧开水
	 */
	public void boilWater() {
		System.out.println("煮开水");
	}

	/**
	 * 浸泡茶
	 */
	public void steepTeaBag() {
		System.out.println("浸泡茶");
	}

	/**
	 * 添加柠檬
	 */
	public void addLemon() {
		System.out.println("添加柠檬");
	}

	/**
	 * 倒入杯中
	 */
	public void pourInCup() {
		System.out.println("倒入杯中");
	}
}
