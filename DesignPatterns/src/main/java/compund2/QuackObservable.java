package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public interface QuackObservable { 
	/**
	*
	*
	*/
	public void addObserver(Observer observer);

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
