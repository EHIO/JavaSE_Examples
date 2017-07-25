package behavior.iterator;

import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List<Object> list;

	public ConcreteAggregate(List<Object> list) {
		this.list = list;

	}

	public void add(Object obj) {
		list.add(obj);

	}

	public Iterator iterator() {

		return new ConcreteIterator(list);
	}

	public void remove(Object obj) {
		list.remove(obj);

	}

}
