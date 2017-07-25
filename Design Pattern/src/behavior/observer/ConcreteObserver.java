package behavior.observer;
/**
 * 具体的观察者
 * @author run
 *
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("I am notityfied");
	}

}
