package behavior.iterator.example_v2;
 

/**
 * 具体迭代器  
 * @author run
 *
 */
public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;	//记录当前数组遍历的位置
 
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
 
	/**
	 * 返回数组的下一项
	 * @return 
	 * @author wg
	 * @date 2016年11月30日 下午11:39:51
	 * @see behavior.iterator.example_v2.Iterator#next()
	 */
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
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
		//因为使用的是固定长度的数组， 所以不但要检查是否超出了数组长度， 也必须检查下一项是否为空，如果为空， 就表示没有元素了
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
