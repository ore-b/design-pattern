package kr.co.oreb.dp.chapter06.command.remote.command;

import kr.co.oreb.dp.chapter06.command.remote.receiver.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
        System.out.println("ceilingFan speed high");
    }

}
