package kr.co.oreb.dp.chapter06.command.remote.command;

import kr.co.oreb.dp.chapter06.command.remote.receiver.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }

    @Override
    public void undo() {
        light.lightOn();
    }
}
