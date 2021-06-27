package compund;

/**
 * @author Ahmed
 * 
 */
public interface QuackObservable {
	void registerObserver(Observer observer);

	void notifyObservers();
}
