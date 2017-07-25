package behavior.iterator.example_v1;

import java.util.*;


/**
 * Ů�д�
 * 
 * @author run
 *
 */
public class Waitress {

	/**
	 * ��ӡÿ�ݲ˵���������
	 */
	public void printMenu() {
		// ����ݲ˵�������
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
		
		// �����˵�������
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
