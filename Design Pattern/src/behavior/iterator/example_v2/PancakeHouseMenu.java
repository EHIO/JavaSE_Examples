package behavior.iterator.example_v2;

import java.util.ArrayList;

/**
 * ����ݲ˵�
 * 
 * @author run
 *
 */
public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B������", "�������,��˾", true, 2.99);

		addItem("��ͨ������", "����ͼ弦��,�㳦", false, 2.99);

		addItem("��ݮ���", "��������ʵ���ݮ,��ݮ�ǽ�", true, 3.49);

		addItem("�����", "�������,����ѡ�����ݮ���ݮ", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public Iterator createIterator() {
		return new PancakeHouseIterator(menuItems);
	}

	// other menu methods here
}
