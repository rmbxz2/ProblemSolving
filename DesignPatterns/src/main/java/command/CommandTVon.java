package command;

public class CommandTVon implements Command {
    private Television tv;

    public CommandTVon(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

}
