package structural.composite.v2;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

	Stack stack = new Stack();
	
	/**
	 * ������Ҫ�����Ķ�����ϵĵ��������룬 ����ѹ��׵ջ����
	 */
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		/*
		 * ����ջ�Ƿ�Ϊ�գ� Ϊ�գ� ��ʾû����һ��Ԫ�أ�
		 * �������ǾʹӶ�ջ�Ķ���ȡ���������������Ƿ�����һ��Ԫ��
		 * �����û��Ԫ�أ� �ͽ���������ջ�� Ȼ��ݹ����hasNext()
		 */
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
//				�Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			//�鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ�����
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
