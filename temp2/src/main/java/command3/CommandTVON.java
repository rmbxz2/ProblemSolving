package command3;

/**
* Describe class here.
*
*
*
*
*
*/
public class CommandTVON implements Command {
	private TV tv;

	/**
	 * @param tv
	 */
	public CommandTVON(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
	    tv.on();
	}
}
