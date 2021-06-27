package compund3; 

/**
* Describe class here.
*
*
*
*
*
*/
public class GooseAdapter implements Quackable{

	private Goose goose;
	private Observable observable;

	/**
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		goose.honk();
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
		return "GooseAdapter ";
	}
}
