package behavior.iterator.example_v1;

import java.util.ArrayList;


/**
 * 女招待
 *
 * @author run
 */
public class Waitress {

	/**
	 * 打印每份菜单的所有项
	 */
	public void printMenu() {
		// 煎饼屋菜单所有项
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

		// 餐厅菜单所有项
		DinerMenu dinerMenu = new DinerMenu();
		MenuItem[] lunchItems = dinerMenu.getMenuItems();

		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem) breakfastItems.get(i);
			System.out.println(menuItem.getName() + "	");
			System.out.println(menuItem.getDescription() + "	");
			System.out.println(menuItem.getPrice() + "	");
		}

		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + "	");
			System.out.println(menuItem.getDescription() + "	");
			System.out.println(menuItem.getPrice() + "	");
		}
	}
}
