package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class GooseAdapter implements Quackable {
	private Goose goose;
	private Observable observable;

	@Override
	public void quack() {
		goose.honk();
		notifyAllObservers();
	}

	/**
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
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
