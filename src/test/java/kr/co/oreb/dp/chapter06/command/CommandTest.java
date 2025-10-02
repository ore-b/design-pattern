package kr.co.oreb.dp.chapter06.command;

import kr.co.oreb.dp.chapter06.command.remote.command.CeilingFanHighCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.CeilingFanLowCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.CeilingFanMediumCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.CeilingFanOffCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.GarageDoorColseCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.GarageDoorOpenCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.LightOffCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.LightOnCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.PartyModeOffCommand;
import kr.co.oreb.dp.chapter06.command.remote.command.PartyModeOnCommand;
import kr.co.oreb.dp.chapter06.command.remote.invoker.RemoteControl;
import kr.co.oreb.dp.chapter06.command.remote.receiver.CeilingFan;
import kr.co.oreb.dp.chapter06.command.remote.receiver.GarageDoor;
import kr.co.oreb.dp.chapter06.command.remote.receiver.Light;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    void commandTest() {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        remoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        remoteControl.setCommand(1, new GarageDoorOpenCommand(garageDoor),
            new GarageDoorColseCommand(garageDoor));

        System.out.println(remoteControl);

        remoteControl.pushOnButton(0);
        remoteControl.undo();
        remoteControl.pushOffButton(0);
        remoteControl.undo();
        remoteControl.pushOnButton(1);
        remoteControl.undo();
        remoteControl.pushOffButton(1);
        remoteControl.undo();
    }

    @Test
    void commandTestByCeilingFan() {
        CeilingFan ceilingFan = new CeilingFan();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, new CeilingFanHighCommand(ceilingFan),
            new CeilingFanOffCommand(ceilingFan));
        remoteControl.setCommand(1, new CeilingFanMediumCommand(ceilingFan),
            new CeilingFanOffCommand(ceilingFan));
        remoteControl.setCommand(2, new CeilingFanLowCommand(ceilingFan),
            new CeilingFanOffCommand(ceilingFan));

        System.out.println(remoteControl);

        remoteControl.pushOnButton(0);
        remoteControl.undo();
        remoteControl.pushOffButton(0);
        remoteControl.undo();
        remoteControl.pushOnButton(1);
        remoteControl.undo();
        remoteControl.pushOffButton(1);
        remoteControl.undo();
        remoteControl.pushOnButton(2);
        remoteControl.undo();
        remoteControl.pushOffButton(2);
        remoteControl.undo();
    }


    @Test
    void commandTestByParty() {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan();

        PartyModeOnCommand partyModeOnCommand = new PartyModeOnCommand(new LightOnCommand(light),
            new GarageDoorOpenCommand(garageDoor), new CeilingFanHighCommand(ceilingFan));
        PartyModeOffCommand partyModeOffCommand = new PartyModeOffCommand(
            new LightOffCommand(light),
            new GarageDoorColseCommand(garageDoor), new CeilingFanOffCommand(ceilingFan));

        remoteControl.setCommand(0, partyModeOnCommand, partyModeOffCommand);

        remoteControl.pushOnButton(0);
        remoteControl.pushOffButton(0);


    }
}
