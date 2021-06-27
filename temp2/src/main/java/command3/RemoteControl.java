package command3;

/**
* Describe class here.
*
*
*
*
*
*/
public class RemoteControl {

	private Command[] commandsON;
	private Command[] commandsOFF;

	/**
	 * 
	 */
	public RemoteControl() {
		commandsON = new Command[3];
		commandsOFF = new Command[3];
		for (int index = 0; index < commandsON.length; index++) {
			commandsON[index] = new NOCommand();
			commandsOFF[index] = new NOCommand();
		}
	}

	/**
	*
	*
	*/
	public void setCommand(int slot, Command commandON, Command commandOFF) {
		commandsON[slot] = commandON;
		commandsOFF[slot] = commandOFF;
	}

	/**
	*
	*
	*/
	public void onButtonPressed(int slot) {
		commandsON[slot].execute();
	}

	/**
	*
	*
	*/
	public void offButtonPressed(int slot) {
	    commandsOFF[slot].execute();
	}
}
