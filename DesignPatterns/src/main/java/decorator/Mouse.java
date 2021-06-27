package decorator;

public class Mouse extends Decorator {
	private Computer computer;

	/**
	 * 
	 * @param computer
	*/
	public Mouse(Computer computer) {
		this.computer = computer;
	}

	/**
	 * 
	 * 
	*/
	public String description() {
 		return this.computer.description() + " Mouse ";
	}

	/**
	 * 
	 * 
	*/
	public int account() {
		return this.computer.account() + 1;
	}
}
