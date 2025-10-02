package kr.co.oreb.dp.chapter06.command.remote.command;

import kr.co.oreb.dp.chapter06.command.remote.receiver.CeilingFan;

public abstract class CeilingFanCommand implements Command {

    protected final CeilingFan ceilingFan;

    protected int prevSpeed;

    protected CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
        this.prevSpeed = CeilingFan.OFF;
    }


    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
            System.out.println("ceilingFan undo, speed high");
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
            System.out.println("ceilingFan undo, speed medium");
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
            System.out.println("ceilingFan undo, speed low");
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
            System.out.println("ceilingFan undo, speed off");
        }
    }
}
