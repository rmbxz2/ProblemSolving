package command;

public class RemoteControl {
	private Command[] onCommand;
	private Command[] offCommand;

	public RemoteControl() {
		onCommand = new Command[3];
		offCommand = new Command[3];
		Command noCommand = new NoCommand();
		for (int index = 0; index < 3; index++) {
			onCommand[index] = noCommand;
			offCommand[index] = noCommand;
		}
	}

	public void addCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommand[slot] = onCommand;
		this.offCommand[slot] = offCommand;
	}

	public void onButtonPressed(int slot) {
		onCommand[slot].execute();
	}

	public void offButtonPressed(int slot) {
		offCommand[slot].execute();
	}
}
