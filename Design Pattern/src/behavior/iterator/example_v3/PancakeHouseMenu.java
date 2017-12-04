package behavior.iterator.example_v3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼屋菜单
 *
 * @author run
 */
public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("葱油饼", "北方地区特色小吃的一种, 属闽菜或鲁菜菜系", true, 2.99);

		addItem("千层饼", "山东东平接山乡一带的传统名吃之一", false, 2.99);

		addItem("老婆饼", "广东潮州地区的特色传统名点", true, 3.49);

		addItem("煎饼果子", "天津市的著名小吃", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator createIterator() {
		return menuItems.iterator();
	}

	// other menu methods here
}
