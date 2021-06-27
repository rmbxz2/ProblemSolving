package decorator2;

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
		return 1000;
	}

}
