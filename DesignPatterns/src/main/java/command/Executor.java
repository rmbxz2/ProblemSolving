package command;

public class Executor {
	public static final int TV_SLOT = 0;

 	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Television tv = new Television();
		CommandTVon commandTVon = new CommandTVon(tv);
		CommandTVoff commandTVoff = new CommandTVoff(tv);

		// remoteControl.addCommand(TV_SLOT, commandTVon, commandTVoff);
		remoteControl.addCommand(TV_SLOT, () -> tv.turnOn(), () -> tv.turnOff()); // lamda

		remoteControl.onButtonPressed(TV_SLOT);
		remoteControl.offButtonPressed(TV_SLOT);

		System.out.println("================");

		remoteControl.onButtonPressed(1);
		remoteControl.offButtonPressed(1);

		remoteControl.onButtonPressed(2);
		remoteControl.offButtonPressed(2);
	}
}
