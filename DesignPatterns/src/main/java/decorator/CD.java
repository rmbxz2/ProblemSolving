package decorator;
public class CD extends Decorator {
	private Computer computer;

	/**
	 * 
	 * @param computer
	*/
	public CD(Computer computer) {
		this.computer = computer;

	}

	public String description() {
	 return this.computer.description() + " CD";
	}

	public int account() {
		return this.computer.account() + 1;
	}
}
