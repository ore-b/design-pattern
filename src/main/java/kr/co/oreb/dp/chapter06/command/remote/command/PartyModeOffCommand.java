package kr.co.oreb.dp.chapter06.command.remote.command;

public class PartyModeOffCommand implements Command {

    private final Command[] commands;

    public PartyModeOffCommand(Command... commands) {
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
