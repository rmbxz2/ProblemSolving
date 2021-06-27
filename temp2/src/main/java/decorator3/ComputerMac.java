package decorator3;

/**
* Describe class here.
*
*
*
*
*
*/
public class ComputerMac extends Computer {

	@Override
	public String getDescription() {
		return "Computer Mac";
	}

	@Override
	public int getCost() {
		System.out.println("cost = " + 1000);
		return 1000;
	}

}
