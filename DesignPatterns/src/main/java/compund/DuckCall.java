package compund;

public class DuckCall implements Quackable {
	Observable observable;

	/**
	 * 
	 */
	public DuckCall() {
		observable = new Observable(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.Quackable#quack()
	 */
	public void quack() {
		System.out.println("kwak");
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "duck call";
	}
}
