package kr.co.oreb.dp.chapter06.command.remote.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        //do nothing
    }

    @Override
    public void undo() {
        //do nothing
    }
}
