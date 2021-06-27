package command3;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainCommand {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		TV tv = new TV();
		Command commandOnTV = new CommandTVON(tv);
		Command commandOffTV = new CommandTVOFF(tv);
		remoteControl.setCommand(0, commandOnTV, commandOffTV);
		remoteControl.onButtonPressed(0);
		remoteControl.offButtonPressed(0);
		System.out.println("=================");
		VLC vlc = new VLC();
		Command commandOnVLC = new CommandVLCon(vlc);
		Command commandOffVLC = new CommandVLCoff(vlc);
		remoteControl.setCommand(1, commandOnVLC, commandOffVLC);
		remoteControl.onButtonPressed(1);
		remoteControl.offButtonPressed(1);
		System.out.println("================");
		remoteControl.onButtonPressed(2);
	}
}
