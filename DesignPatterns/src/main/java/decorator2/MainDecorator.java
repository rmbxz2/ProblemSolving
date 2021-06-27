package decorator2;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainDecorator {
	public static void main(String[] args) {
		Computer computerIBM = new HD(new CD(new Monitor(new ComputerIBM())));
		System.out.println(computerIBM.getDescription());
		System.out.println(computerIBM.getCost());
		System.out.println("================");
		Computer computerMac = new HD(new CD(new Monitor(new ComputerMac())));
		System.out.println(computerMac.getDescription());
		System.out.println(computerMac.getCost());

	}
}
