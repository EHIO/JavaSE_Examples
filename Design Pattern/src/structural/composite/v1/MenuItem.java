package structural.composite.v1;

/**
 * 菜单项
 * @author run
 *
 */
public class MenuItem extends MenuComponent {
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

	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());

	}
}
