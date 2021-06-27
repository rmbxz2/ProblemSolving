package command;

public class CommandTVoff implements Command {
    private Television tv;

    public CommandTVoff(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
