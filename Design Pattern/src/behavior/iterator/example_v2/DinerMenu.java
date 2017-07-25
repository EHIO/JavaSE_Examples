package behavior.iterator.example_v2;

/**
 * 
 * �����˵�
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

		addItem("��ʳBLT", "(Fakin)������˺���������ȫ��", true, 2.99);
		addItem("BLT", "������˺���������ȫ��", false, 2.99);
		addItem("��", "��,һ�ߵ�����ɳ��", false, 3.29);
		addItem("�ȹ�", "һ���ȹ�,saurkraut����ֵ�,���,���������", false, 3.05);
		addItem("���߲˺Ͳ���", "�ڲ������߲�", true, 3.99);
		addItem("�������", "�⽴���������,��һƬ�����ĸ", true, 3.89);
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
