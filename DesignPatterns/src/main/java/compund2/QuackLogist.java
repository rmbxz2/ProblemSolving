package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class QuackLogist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("duck " + duck + " just quackeded");
	}
}
