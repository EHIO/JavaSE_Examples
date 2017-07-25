package behavior.iterator.example_v3;

import java.util.Iterator;

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
