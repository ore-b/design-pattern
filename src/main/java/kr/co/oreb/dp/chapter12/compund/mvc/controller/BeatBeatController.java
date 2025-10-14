package kr.co.oreb.dp.chapter12.compund.mvc.controller;

import kr.co.oreb.dp.chapter12.compund.mvc.model.BeatModelInterface;

public class BeatBeatController implements BeatControllerInterface {

    private final BeatModelInterface model;

    public BeatBeatController(BeatModelInterface model) {
        this.model = model;
    }

    @Override
    public void start() {
        model.on();
    }

    @Override
    public void stop() {
        model.off();
    }

    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    @Override
    public void setBpm(int bpm) {
        model.setBPM(bpm);
    }
}
