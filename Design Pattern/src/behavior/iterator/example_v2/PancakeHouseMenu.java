package behavior.iterator.example_v2;

import java.util.ArrayList;

/**
 * ¼å±ıÎİ²Ëµ¥
 * 
 * @author run
 *
 */
public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B¼å±ıÔç²Í", "¼å±ı³´µ°,ÍÁË¾", true, 2.99);

		addItem("ÆÕÍ¨¼å±ıÔç²Í", "¼å±ıºÍ¼å¼¦µ°,Ïã³¦", false, 2.99);

		addItem("À¶İ®¼å±ı", "¼å±ıÓÃĞÂÏÊµÄÀ¶İ®,À¶İ®ÌÇ½¬", true, 3.49);

		addItem("»ª·ò±ı", "»ª·ò±ı¸É,ÄãËùÑ¡ÔñµÄÀ¶İ®»ò²İİ®", true, 3.59);
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
