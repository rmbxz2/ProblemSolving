package command3;

/**
* Describe class here.
*
*
*
*
*
*/
public class CommandTVOFF implements Command {
	private TV tv;

	/**
	 * @param tv
	 */
	public CommandTVOFF(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}
}
