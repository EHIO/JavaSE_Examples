package behavior.iterator.example_v1;

/**
 * 菜单项
 *
 * @author run
 */
public class MenuItem {
	/**
	 * 名称
	 */
	String name;
	/**
	 * 描述
	 */
	String description;
	/**
	 * 是否为素食的标记
	 */
	boolean vegetarian;
	/**
	 * 价格
	 */
	double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}
}
