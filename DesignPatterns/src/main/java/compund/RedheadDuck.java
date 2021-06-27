package compund;

public class RedheadDuck implements Quackable {
	Observable observable;

	/**
	 * 
	 */
	public RedheadDuck() {
		observable = new Observable(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.Quackable#quack()
	 */
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.QuackObservable#notifyObservers()
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Readhead call";
	}
}
