package decorator;


public class Monitor extends Decorator {
	private Computer computer;

	/**
	 * 
	 * @param computer
	*/
	public Monitor(Computer computer) {
		this.computer = computer;

	}

	/**
	 * 
	 * 
	*/
	public String description() {
		return this.computer.description() + " Monitor";
		//return this.computer.description() + (computer.account() == 0 ? " " : " and ") + " Monitor";
	}

	/**
	 * 
	 * 
	*/
	public int account() {
		return this.computer.account() + 1;
	}
}
