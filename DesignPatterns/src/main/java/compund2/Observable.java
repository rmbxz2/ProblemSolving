package compund2;

import java.util.ArrayList;

/**
* Describe class here.
*
*
*
*
*
*/
public class Observable implements QuackObservable {

	private ArrayList<Observer> observers;
	private QuackObservable duck;

	/**
	 * 
	 */
	public Observable(QuackObservable duck) {
		this.duck = duck;
		observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(duck);
		}
	}

}
