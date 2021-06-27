package compund;

public class QuackCounter implements Quackable {

	private Quackable duck;
	private static int numberOfQuacks;

	/**
	 * @param duck
	 */
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.Quackable#quack()
	 */
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	/**
	 * @return
	 */
	public static int getQuacks() {
		return numberOfQuacks;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.QuackObservable#notifyObservers()
	 */
	public void notifyObservers() {
		duck.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pattern_OF_Patterns.QuackObservable#registerObserver(pattern_OF_Patterns
	 * .Observer)
	 */
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
}
