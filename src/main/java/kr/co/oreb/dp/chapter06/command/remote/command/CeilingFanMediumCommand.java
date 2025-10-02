package kr.co.oreb.dp.chapter06.command.remote.command;

import kr.co.oreb.dp.chapter06.command.remote.receiver.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
        System.out.println("ceilingFan speed medium");
    }


}
