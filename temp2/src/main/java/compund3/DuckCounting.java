package compund3;

/**
* Describe class here.
*
*
*
*
*
*/
public class DuckCounting implements Quackable {

	private static int quackCounter;
	private Quackable duck;

	/**
	 * @param duck
	 */
	public DuckCounting(Quackable duck) {
		this.duck = duck;
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void quack() {
		duck.quack();
		quackCounter++;
	}

	/**
	*
	*
	*/
	public static int getQuackCounter() {
		return quackCounter;
	}

	@Override
	public void registerObserver(Observer observer) {
	    duck.registerObserver(observer);
	}

	@Override
	public void unRegesterObserver(Observer observer) {
	    duck.unRegesterObserver(observer);

	}

	@Override
	public void notifyAllObservers() {
	    duck.notifyAllObservers();
	}
}
