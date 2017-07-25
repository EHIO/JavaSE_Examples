package behavior.iterator.example_v2;

import java.util.ArrayList;

/**
 * ���������  
 * @author run
 *
 */
public class PancakeHouseIterator implements Iterator {
	ArrayList<MenuItem> menuItems;
	int position = 0;	//��¼��ǰ������λ��
 
	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
 
	/**
	 * �����������һ��
	 * @return 
	 * @author wg
	 * @date 2016��11��30�� ����11:39:51
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
	 * ����Ƿ��Ѿ�ȡ���������ڵ�����Ԫ�أ� �������Ԫ�ر����� �򷵻�true
	 * @return 
	 * @author wg
	 * @date 2016��11��30�� ����11:37:10
	 * @see behavior.iterator.example_v2.Iterator#hasNext()
	 */
	public boolean hasNext() {
		return !(position == menuItems.size());
	}
}
