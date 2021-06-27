package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class RubberDuck implements Quackable {
	private Observable observable;

	/**
	 * 
	 */
	public RubberDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("squeak");
		notifyAllObservers();
	}

	@Override
	public void addObserver(Observer observer) {
	    observable.addObserver(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
	    observable.removeObserver(observer);
	}

	@Override
	public void notifyAllObservers() {
	    observable.notifyAllObservers();
	}
}
