package behavior.observer;
/**
 * ����Ĺ۲���
 * @author run
 *
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("I am notityfied");
	}

}
