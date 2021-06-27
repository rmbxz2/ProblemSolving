package decorator2;

/**
* Describe class here.
*
*
*
*
*
*/
public class Monitor extends Decorator {
	private Computer computer;

	/**
	 * @param computer
	 */
	public Monitor(Computer computer) {
		this.computer = computer;
	}

	@Override
	public String getDescription() {
		return computer.getDescription() + " monitor  " ;
	}

	@Override
	public int getCost() {
		return computer.getCost() + 33 ;
	}
}
