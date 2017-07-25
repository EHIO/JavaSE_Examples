package behavior.iterator.example_v2;

import java.util.ArrayList;

/**
 * 具体迭代器  
 * @author run
 *
 */
public class PancakeHouseIterator implements Iterator {
	ArrayList<MenuItem> menuItems;
	int position = 0;	//记录当前遍历的位置
 
	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
 
	/**
	 * 返回数组的下一项
	 * @return 
	 * @author wg
	 * @date 2016年11月30日 下午11:39:51
	 * @see behavior.iterator.example_v2.Iterator#next()
	 */
	public MenuItem next() {
		MenuItem menuItem = null;
		if (hasNext()) {
			menuItem = menuItems.get(position++);
		}
		return menuItem;
	}
 
	/**
	 * 检查是否已经取得了数组内的所有元素， 如果还有元素遍历， 则返回true
	 * @return 
	 * @author wg
	 * @date 2016年11月30日 下午11:37:10
	 * @see behavior.iterator.example_v2.Iterator#hasNext()
	 */
	public boolean hasNext() {
		return !(position == menuItems.size());
	}
}
