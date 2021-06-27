package compund3;

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

	/**
	 * @param observable
	 */
	public DuckCall() {
		observable = new Observable(this); // record me(DuckCall) as observable 
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void quack() {
		System.out.println("quack");
		notifyAllObservers();
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void unRegesterObserver(Observer observer) {
		observable.unRegesterObserver(observer);
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void notifyAllObservers() {
		observable.notifyAllObservers();
	}

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return " DuckCall ";
    }

}
