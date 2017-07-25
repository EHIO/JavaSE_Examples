package behavior.iterator.example_v2;
 

/**
 * ���������  
 * @author run
 *
 */
public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;	//��¼��ǰ���������λ��
 
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
 
	/**
	 * �����������һ��
	 * @return 
	 * @author wg
	 * @date 2016��11��30�� ����11:39:51
	 * @see behavior.iterator.example_v2.Iterator#next()
	 */
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
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
		//��Ϊʹ�õ��ǹ̶����ȵ����飬 ���Բ���Ҫ����Ƿ񳬳������鳤�ȣ� Ҳ��������һ���Ƿ�Ϊ�գ����Ϊ�գ� �ͱ�ʾû��Ԫ����
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
