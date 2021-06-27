package compund3;

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
	public void registerObserver(Observer observer) {
	    observable.registerObserver(observer);

	}

	@Override
	public void unRegesterObserver(Observer observer) {
	    observable.unRegesterObserver(observer);

	}

	@Override
	public void notifyAllObservers() {
	    observable.notifyAllObservers();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "RubberDuck ";
	}
}
