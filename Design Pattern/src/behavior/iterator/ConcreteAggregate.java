package behavior.iterator;

import java.util.List;

/**
 * 具体的集合
 */
public class ConcreteAggregate implements Aggregate {

	private List<Object> list;

	public ConcreteAggregate(List<Object> list) {
		this.list = list;
	}

	@Override
	public void add(Object obj) {

		list.add(obj);
	}

	@Override
	public Iterator iterator() {

		return new ConcreteIterator(list);
	}

	@Override
	public void remove(Object obj) {

		list.remove(obj);
	}
}
