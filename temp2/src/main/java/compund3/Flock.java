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
public class Flock implements Quackable {

	private ArrayList<Quackable> ducks;

	/**
	 * 
	 */
	public Flock() {
		ducks = new ArrayList<Quackable>();
	}

	/**
	*
	*
	*/
	public void addQuacker(Quackable duck) {
		ducks.add(duck);
	}

	@Override
	public void registerObserver(Observer observer) {
		for (Quackable quackable : ducks) {
			quackable.registerObserver(observer);
		}
	}

	@Override
	public void unRegesterObserver(Observer observer) {
		for (Quackable quackable : ducks) {
		    quackable.unRegesterObserver(observer);
		}
	}

	@Override
	public void notifyAllObservers() {

	}

	@Override
	public void quack() {
		for (Quackable quackable : ducks) {
			quackable.quack();
		}

	}
}
