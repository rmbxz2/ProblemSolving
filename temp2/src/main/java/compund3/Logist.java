package compund3;

/**
* Describe class here.
*
*
*
*
*
*/
public class Logist implements Observer {

	/**
	 * 
	 * 
	*/
	@Override
	public void update(QuackObservable duck) {
		System.out.println("duck " + duck + " quacked ");
		System.out.println("===========");
	}
}
