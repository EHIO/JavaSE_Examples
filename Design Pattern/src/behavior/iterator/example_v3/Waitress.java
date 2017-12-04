package behavior.iterator.example_v3;

import java.util.Iterator;

/**
 * 女招待
 *
 * @author run
 */
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;

	/**
	 * 构造器中， 女招待要照顾两种菜单
	 */
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	/**
	 * 打印每份菜单的所有项
	 */
	public void printMenu() {
		// 煎饼屋菜单所有项
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		this.printMenu(breakfastIterator);
		System.err.println("----------------------------------");
		// 餐厅菜单所有项
		Iterator lunchIterator = dinerMenu.createIterator();
		this.printMenu(lunchIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " --- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
