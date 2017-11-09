package org.wg.generic;

import org.junit.Test;
import org.wg.entity.Animal;
import org.wg.entity.Cat;
import org.wg.entity.Dog;
import org.wg.entity.Student;
import org.wg.set.treeset.test.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型演示
 *
 * @author wg
 */
public class GenericTest {

	/**
	 * 测试泛型方法
	 */
	@Test
	public void demo() {
		Tool<String> tool = new Tool<>();

		tool.show(new Integer(4));
		tool.show("呵呵");
		tool.print("嘿嘿嘿");
//		tool.print(new Integer(8));
		Tool.method("哦哦");
		Tool.method(new Integer(9));
	}

	/**
	 *
	 * ? : 任意类型，如果没有明确，那么就是Object以及任意的Java类了
	 * ? extends E:向下限定，E及其子类
	 * ? super E:向上限定，E极其父类
	 */
	@Test
	public void demo2() {
		Collection<Object> c1 = new ArrayList<>();
		Collection<Animal> c2 = new ArrayList<>();
		Collection<Dog> c3 = new ArrayList<>();
		Collection<Cat> c4 = new ArrayList<>();

		// ? 通配符
		Collection<?> c5 = new ArrayList<Object>();
		Collection<?> c6 = new ArrayList<Animal>();
		Collection<?> c7 = new ArrayList<Dog>();
		Collection<?> c8 = new ArrayList<Cat>();

		// ? extends E: 通配符的子类型限定
		// Collection<? extends Animal> c9 = new ArrayList<Object>();
		Collection<? extends Animal> c10 = new ArrayList<Animal>();
		Collection<? extends Animal> c11 = new ArrayList<Dog>();
		Collection<? extends Animal> c12 = new ArrayList<Cat>();

		// ? super E: 通配符的超类型限定
		Collection<? super Animal> c13 = new ArrayList<Object>();
		Collection<? super Animal> c14 = new ArrayList<Animal>();
//         Collection<? super Animal> c15 = new ArrayList<Dog>();
//         Collection<? super Animal> c16 = new ArrayList<Cat>();
	}


	@Test
	public void demo3() {
		ArrayList<String> al = new ArrayList<>();
		al.add("abc");
		al.add("hehe");

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(5);
		al2.add(67);

		printCollection(al);
		printCollection(al2);
	}

	@Test
	public void demo4() {
		List<Animal> al = new ArrayList<>();
		al.add(new Cat("汤姆", 2));
		al.add(new Dog("赤丸", 3));

		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(new Student("东邪", 55));
		al2.add(new Student("西毒", 56));

		printCollection2(al2);
		printCollection2(al);
		printCollection3(al);
	}

	/**
	 * 通配符
	 *
	 * @param al
	 */
	public static void printCollection(Collection<?> al) {
		Iterator<?> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	public static <E> void printCollection2(Collection<? super E> al) {
		Iterator<? super E> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static <E> void printCollection3(Collection<? extends E> al) {
		Iterator<? extends E> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}