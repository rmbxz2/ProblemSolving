package command3; 

/**
* Describe class here.
*
*
*
*
*
*/
public class CommandVLCoff implements Command{

	private VLC vlc;

	/**
	 * @param vlc
	 */
	public CommandVLCoff(VLC vlc) {
		this.vlc = vlc;
	}

	@Override
	public void execute() {
		vlc.off();
	}
}
