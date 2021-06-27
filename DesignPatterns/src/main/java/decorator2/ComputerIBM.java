package decorator2;

/**
* Describe class here.
*
*
*
*
*
*/
public class ComputerIBM extends Computer {

	@Override
	public String getDescription() {
		return "Computer IBM";
	}

	@Override
	public int getCost() {
		return 99;
	}

}
