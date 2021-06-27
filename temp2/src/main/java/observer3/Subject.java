package observer3;

/**
* Describe class here.
*
*
*
*
*
*/
public interface Subject {
	/**
	*
	*
	*/
	public void registerObserver(Observer observer);

	/**
	*
	*
	*/
	public void removeObserver(Observer observer);

	/**
	*
	*
	*/
	public void notifyAllObservers();
}
