package behavior.iterator.example_v2;

/**
 * 菜单项
 * 
 * @author run
 *
 */
public class MenuItem {
	String name; // 名称
	String description; // 叙述
	boolean vegetarian; // 是否为素食的标记
	double price; // 价格

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
