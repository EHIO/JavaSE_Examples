package behavior.observer.practice;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notityObserver(Object arg);
}
