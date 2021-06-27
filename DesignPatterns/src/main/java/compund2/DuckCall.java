package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class DuckCall implements Quackable {
	private Observable observable;

	@Override
	public void quack() {
		System.out.println("kwak");
		notifyAllObservers();
	}

	/**
	 * @param observable
	 */
	public DuckCall() {
		observable = new Observable(this);
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
