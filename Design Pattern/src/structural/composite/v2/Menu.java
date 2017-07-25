package structural.composite.v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ×éºÏ²Ëµ¥
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
	
	public void remove(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
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

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getDescription() {
		
		return description;
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		
		return new CompositeIterator(menuComponents.iterator());
	}
}
