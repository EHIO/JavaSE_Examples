package behavior.observer;

import java.util.Enumeration;
import java.util.Vector;
/**
 * 具体的主题
 * @author run
 *
 */
public class ConcreteSubject implements Subject {
	private Observer ob ;
	private Vector vc = new Vector();
	@Override
	public void attach() {
		vc.add(ob);
	}
	
	public ConcreteSubject() {
		super();
		ob = new ConcreteObserver();
	}

	@Override
	public void detach() {
		vc.remove(ob);
	}

	@Override
	public void notityObservers() {
		Enumeration en = observers();
		while(en.hasMoreElements()) {
			((Observer)en.nextElement()).update();
		}
	}
	
	public Enumeration observers() {
		return vc.elements();
	}
}
