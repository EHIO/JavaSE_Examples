package structural.composite.v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 组合菜单
 * @author run
 *
 */
public class Menu extends MenuComponent {
	List menuComponents = new ArrayList();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
	}

	@Override
	public String getDescription() {

		return description;
	}

	@Override
	public String getName() {

		return name;
	}

	public void print() {
		System.out.println(this.getName());
		System.out.println(getDescription());
		System.out.println("--------------");

		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
		}
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
}
