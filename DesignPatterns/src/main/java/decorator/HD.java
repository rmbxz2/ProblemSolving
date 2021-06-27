package decorator;

public class HD extends Decorator {
	private Computer computer;

	/**
	 * 
	 * @param computer
	*/
	public HD(Computer computer) {

		this.computer = computer;
	}

	/**
	 * 
	 * 
	*/
    	public String description() {
	 return this.computer.description() + " HD";
	    //return this.computer.description() + (computer.account() == 0 ? " " : " and ") + " HD";
	}

    	/**
	 * 
	 * 
	*/
	public int account() {
		return this.computer.account() + 1;
	}

}
