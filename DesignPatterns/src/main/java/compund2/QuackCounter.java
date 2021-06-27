package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class QuackCounter implements Quackable {
	private Quackable duck;
	private static int counter = 0;

	/**
	*
	*
	*/
	public static int getQuckCounter() {
		return counter;
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void quack() {
		duck.quack();
		counter++;
	}

	/**
	 * @param duck
	 */
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void addObserver(Observer observer) {
	    duck.addObserver(observer);

	}

	/**
	 * 
	 * 
	*/
	@Override
	public void removeObserver(Observer observer) {
	    duck.removeObserver(observer);

	}

	/**
	 * 
	 * 
	*/
	@Override
	public void notifyAllObservers() {
	    duck.notifyAllObservers();
	}
}
