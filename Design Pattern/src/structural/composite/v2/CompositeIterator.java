package structural.composite.v2;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

	Stack stack = new Stack();
	
	/**
	 * 把我们要遍历的顶层组合的迭代器传入， 把它压入椎栈顶部
	 */
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		/*
		 * 检查堆栈是否为空， 为空， 表示没有下一个元素；
		 * 否则我们就从堆栈的顶层取出迭代器，看看是否还有下一个元素
		 * 如果它没有元素， 就将它弹出堆栈， 然后递归调用hasNext()
		 */
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
//				移除堆栈顶部的对象，并作为此函数的值返回该对象。
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
			//查看堆栈顶部的对象，但不从堆栈中移除它。
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
