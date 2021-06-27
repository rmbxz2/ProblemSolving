package command3; 

/**
* Describe class here.
*
*
*
*
*
*/
public class CommandVLCon implements Command{

	private VLC vlc;

	/**
	 * @param vlc
	 */
	public CommandVLCon(VLC vlc) {
		this.vlc = vlc;
	}

	@Override
	public void execute() {
		vlc.on();
	}
}
