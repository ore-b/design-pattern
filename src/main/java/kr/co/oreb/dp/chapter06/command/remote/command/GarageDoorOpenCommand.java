package kr.co.oreb.dp.chapter06.command.remote.command;

import kr.co.oreb.dp.chapter06.command.remote.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.openDoor();
    }

    @Override
    public void undo() {
        garageDoor.closeDoor();
    }
}
