package kr.co.oreb.dp.chapter06.command.remote.command;

public class PartyModeOnCommand implements Command {

    private final Command[] commands;

    public PartyModeOnCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
