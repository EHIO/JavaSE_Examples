package creational.factory.abstract_factory;

/**
 * 比萨
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;

	/**
	 * 在這裡收集比薩所需要的原料，而這些原料來自於原料工廠
	 */
	abstract void prepare();

	void bake() {
		System.out.println("在350度的温度下烤25分钟");
	}

	void cut() {
		System.out.println("把披萨切成斜片");
	}

	void box() {
		System.out.println("披萨在官方匹萨商店盒子里");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}
