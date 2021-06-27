package compund;

public class Quackologist implements Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pattern_OF_Patterns.Observer#update(pattern_OF_Patterns.QuackObservable)
	 */
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + "just quacked.");
	}

}
