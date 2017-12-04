package behavior.iterator.example_v1;

/**
 * 餐厅菜单
 *
 * @author run
 */
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	/**
	 * 菜单项
	 */
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("东坡肉", "又名红烧肉、滚肉、东坡焖肉，是眉山和江南地区特色传统名菜", true, 2.99);
		addItem("佛跳墙", "又名满坛香、福寿全，是福建福州的当地名菜，属闽菜系", true, 2.99);
		addItem("豆腐汤", "一道传统的以豆腐作为主材配以其他食材烹制的汤料理", false, 3.29);
		addItem("黯然销魂饭", "叉烧加叉烧汁或酱油盖住一碗或一碟白饭而成", true, 3.05);
		addItem("小炒肉", "湖南省一道常见的特色传统名菜，属于湘菜系。麻辣鲜香，口味滑嫩", true, 3.99);
		addItem("酸菜鱼", "也称为酸汤鱼，是一道源自重庆的经典菜品，以其特有的调味和独特的烹调技法而著称", true, 3.89);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("对不起, 菜单已满! 不能添加项目到菜单");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	// other menu methods here
}
