package decorator3;

/**
* Describe class here.
*
*
*
*
*
*/
public class HD extends Decorator {
	private Computer computer;

	/**
	 * @param computer
	 */
	public HD(Computer computer) {
		this.computer = computer;
	}

	@Override
	public String getDescription() {
		return computer.getDescription() + " HD " ;
	}

	@Override
	public int getCost() {
	    System.out.println("cost = "+ 11);
	    return computer.getCost() + 11;
	}
    //    
}
