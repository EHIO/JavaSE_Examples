package behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorTestDrive {
	public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Aggregate aggregate = new ConcreteAggregate(list);
        Iterator iterator = aggregate.iterator();

        while (iterator.hasNext()) {
            String o = (String) iterator.next();
            System.out.println(o);
        }
    }
}

