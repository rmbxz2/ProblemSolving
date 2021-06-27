package decorator3;

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
		System.out.println("cost = " + 99);
		return 99;
	}

}
