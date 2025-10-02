package kr.co.oreb.dp.chapter06.command.remote.command;

import kr.co.oreb.dp.chapter06.command.remote.receiver.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
        System.out.println("ceilingFan speed low");
    }

}
