package observer2;

public interface Subject {

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();

}
