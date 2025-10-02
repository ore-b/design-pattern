package kr.co.oreb.dp.chapter06.command.remote.invoker;

import kr.co.oreb.dp.chapter06.command.remote.command.Command;
import kr.co.oreb.dp.chapter06.command.remote.command.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pushOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pushOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undo() {
        undoCommand.undo();
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sb.append(i + "슬롯 : " + onCommands[i].getClass().getSimpleName() + ", "
                + offCommands[i].getClass().getSimpleName() + "\n");
        }

        return sb.toString();
    }


}
