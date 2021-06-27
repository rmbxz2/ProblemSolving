package command; 

/**
* Describe class here.
*
*
*
*
*
*/
public class NoCommand implements Command {

	@Override
	public void execute() {
	    System.out.println("Null Object pattern");
	}
}
