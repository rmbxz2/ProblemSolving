package compund;

import java.util.ArrayList;

public class Observable implements QuackObservable {

	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.QuackObservable#notifyObservers()
	 */
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(duck);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pattern_OF_Patterns.QuackObservable#registerObserver(pattern_OF_Patterns
	 * .Observer)
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 
	 */
	public ArrayList<Observer> getObservers() {
		return observers;
	}
}
