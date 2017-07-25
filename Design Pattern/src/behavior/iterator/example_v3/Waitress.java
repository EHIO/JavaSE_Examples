package behavior.iterator.example_v3;

import java.util.Iterator;

/**
 * Ů�д�
 * 
 * @author run
 *
 */
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;

	/**
	 * �������У� Ů�д�Ҫ�չ����ֲ˵�
	 * @param menus
	 */
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	/**
	 * ��ӡÿ�ݲ˵���������
	 */
	public void printMenu() {
		// ����ݲ˵�������
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		this.printMenu(breakfastIterator);
		System.err.println("----------------------------------");
		// �����˵�������
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
