package behavior.observer;
/**
 * ����
 * @author run
 *
 */
public interface Subject {
	void attach();
	void detach();
	void notityObservers();
}
