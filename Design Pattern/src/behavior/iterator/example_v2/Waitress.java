package behavior.iterator.example_v2;

/**
 * 女招待
 *
 * @author run
 */
public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	/**
	 * 打印每份菜单的所有项
	 */
	public void printMenu() throws InterruptedException {
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		this.printMenu(breakfastIterator);
		Thread.sleep(100);
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
