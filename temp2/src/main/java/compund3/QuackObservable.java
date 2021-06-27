package compund3;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void unRegesterObserver(Observer observer);
    void notifyAllObservers();
}
