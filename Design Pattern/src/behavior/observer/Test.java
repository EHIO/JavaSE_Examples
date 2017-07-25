package behavior.observer;

public class Test {
	public static void main(String[] args) {
		Subject sb = new ConcreteSubject();
		sb.attach();
		sb.notityObservers();
		sb.detach();
	}
	
}
