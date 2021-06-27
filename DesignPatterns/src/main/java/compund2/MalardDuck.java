package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class MalardDuck implements Quackable {
	private Observable observable;

	/**
	 * @param observable
	 */
	public MalardDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("quack");
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
