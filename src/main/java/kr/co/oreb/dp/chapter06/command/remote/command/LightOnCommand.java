package kr.co.oreb.dp.chapter06.command.remote.command;

import kr.co.oreb.dp.chapter06.command.remote.receiver.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOff();
    }
}
