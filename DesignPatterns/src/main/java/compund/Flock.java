package compund;

import java.util.ArrayList;

public class Flock implements Quackable {
	private ArrayList<Quackable> quackers = new ArrayList<Quackable>();

	/**
	 * @param quacker
	 */
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.Quackable#quack()
	 */
	public void quack() {
		for (Quackable quacker : quackers) {
			quacker.quack();
		}
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pattern_OF_Patterns.QuackObservable#registerObserver(pattern_OF_Patterns
	 * .Observer)
	 */
	public void registerObserver(Observer observer) {
		for (Quackable quacker : quackers) {
			quacker.registerObserver(observer);
		}

	}
}
