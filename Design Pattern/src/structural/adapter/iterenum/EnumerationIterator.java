package structural.adapter.iterenum;

import java.util.*;

/**
 * 枚举适配器
 *
 * @param <E>
 * @author wang.gang
 */
public class EnumerationIterator<E> implements Iterator<E> {
    Enumeration<E> enumeration;

    public EnumerationIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {

        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {

        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("东邪");
        list.add("西毒");
        list.add("南帝");
        list.add("北丐");
        Vector v = new Vector(list);
        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
