package compund;

public class GooseAdapter implements Quackable {

	private Goose goose;
	private Observable observable;

	/**
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.Quackable#quack()
	 */
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pattern_OF_Patterns.QuackObservable#registerObserver(pattern_OF_Patterns
	 * .Observer)
	 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Goose adapter call";
	}

}
