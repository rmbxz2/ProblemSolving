package compund3;

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

	private ArrayList<Observer> quackers;
	private QuackObservable duck;

	/**
	 * @param duckCall
	 * 
	 */
	public Observable(QuackObservable duck) {
		this.duck = duck;
		quackers = new ArrayList<Observer>();
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void registerObserver(Observer observer) {
		quackers.add(observer);
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void unRegesterObserver(Observer observer) {
		quackers.remove(observer);

	}

	/**
	 * 
	 * 
	*/
	@Override
	public void notifyAllObservers() {
		for (Observer observer : quackers) {
			observer.update(duck);
		}
	}

}
