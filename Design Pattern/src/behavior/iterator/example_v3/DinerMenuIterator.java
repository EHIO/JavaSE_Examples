package behavior.iterator.example_v3;

import java.util.Iterator;

/**
 * 具体迭代器
 *
 * @author run
 */
public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;    //记录当前数组遍历的位置

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	/**
	 * 返回数组的下一项
	 */
	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

	/**
	 * 检查是否已经取得了数组内的所有元素， 如果还有元素遍历， 则返回true
	 */
	@Override
	public boolean hasNext() {
		//因为使用的是固定长度的数组， 所以不但要检查是否超出了数组长度， 也必须检查下一项是否为空，如果为空， 就表示没有元素了
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException();
		}
		if (items[position - 1] != null) {
			for (int i = position - 1; i < (items.length - 1); i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}
}
