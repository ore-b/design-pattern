package kr.co.oreb.dp.chapter06.command.remote.command;

import kr.co.oreb.dp.chapter06.command.remote.receiver.GarageDoor;

public class GarageDoorColseCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorColseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.closeDoor();
    }

    @Override
    public void undo() {
        garageDoor.openDoor();
    }
}
