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
public class Flock implements Quackable {

	private ArrayList<Quackable> quackers;

	/**
	 * 
	 */
	public Flock() {
		quackers = new ArrayList<Quackable>();
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void quack() {
		for (Quackable duck : quackers) {
			duck.quack();
		}
	}

	/**
	*
	*
	*/
	public void addQuacker(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void addObserver(Observer observer) {
		for (Quackable duck : quackers) {
			duck.addObserver(observer);
		}

	}

	@Override
	public void removeObserver(Observer observer) {
		for (Quackable duck : quackers) {
			duck.removeObserver(observer);
		}

	}

	@Override
	public void notifyAllObservers() {

	}

	public String toString() {
		return "Flock of Ducks";
	}
}
