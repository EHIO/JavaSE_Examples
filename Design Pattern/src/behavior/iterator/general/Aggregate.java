package behavior.iterator.general;

/**
 * 模拟集合接口 增删查(遍历)
 */
public interface Aggregate {

	public void add(Object obj);

	public void remove(Object obj);

	public Iterator iterator();
}

                                                 