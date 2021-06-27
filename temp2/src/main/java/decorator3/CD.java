package decorator3;

/**
* Describe class here.
*
*
*
*
*
*/
public class CD extends Decorator {
	private Computer computer;

	/**
	 * @param computer
	 */
	public CD(Computer computer) {
		this.computer = computer;
	}

	@Override
	public String getDescription() {
		return computer.getDescription() + " CD ";
	}

	@Override
	public int getCost() {
		System.out.println("cost = " + 22);
		return computer.getCost() + 22;
	}
}
