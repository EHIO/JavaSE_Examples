package behavior.iterator.example_v2;

/**
 * 女招待
 * 
 * @author run
 *
 */
public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	/**
	 * 构造器中， 女招待要照顾两种菜单
	 * @param menus
	 */
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	/**
	 * 打印每份菜单的所有项
	 */
	public void printMenu() {
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		this.printMenu(breakfastIterator);
		System.err.println("----------------------------------");
		Iterator lunchIterator = dinerMenu.createIterator();
		this.printMenu(lunchIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
