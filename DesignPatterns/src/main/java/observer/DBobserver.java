package observer;

import java.util.ArrayList;

/**
 * @author Ahmad
 *
 */
/**
 * @author Ahmad
 * 
 */
public class DBobserver implements Subject {
	private String record;
	private String operation;
	private ArrayList<Observer> obs = new ArrayList<Observer>();
	/*
	 * (non-Javadoc)
	 * 
	 * @see observer_04.Subject#addObserver(observer_04.Observer)
	 */
	public void addObserver(Observer observer) {
		obs.add(observer);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observer_04.Subject#notifyObservers()
	 */
	public void notifyObservers() {
		for (Observer observer : obs) {
			observer.update(operation, record);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observer_04.Subject#removeObserver(observer_04.Observer)
	 */
	public void removeObserver(Observer observer) {
		obs.remove(observer);
	}

	/**
	 * @param operation
	 * @param record
	 */
	public void editObserver(String operation, String record) {
		this.operation = operation;
		this.record = record;
		this.notifyObservers();
	}
}