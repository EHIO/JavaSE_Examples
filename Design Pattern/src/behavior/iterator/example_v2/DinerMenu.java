package behavior.iterator.example_v2;

/**
 * 
 * 餐厅菜单
 * 
 * @author run
 *
 */
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("素食BLT", "(Fakin)培根生菜和西红柿在全麦", true, 2.99);
		addItem("BLT", "培根生菜和西红柿在全麦", false, 2.99);
		addItem("汤", "汤,一边的土豆沙拉", false, 3.29);
		addItem("热狗", "一个热狗,saurkraut津津乐道,洋葱,上面加奶酪", false, 3.05);
		addItem("蒸蔬菜和糙米", "在糙米蒸蔬菜", true, 3.99);
		addItem("意大利面", "蒜酱拌意大利面,和一片面包酵母", true, 3.89);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}

	// other menu methods here
}
