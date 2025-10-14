package kr.co.oreb.dp.chapter12.compund.mvc.view;

import kr.co.oreb.dp.chapter12.compund.mvc.controller.BeatControllerInterface;
import kr.co.oreb.dp.chapter12.compund.mvc.model.BeatModelInterface;

public class DJView implements BeatObserver, BPMObserver {

    private final BeatControllerInterface controller;

    private final BeatModelInterface model;

    public DJView(BeatControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        this.model = model;
        model.registerBeatObserver(this);
        model.registerBPMObserver(this);
    }

    public void pressStartButton() {
        controller.start();
    }

    public void pressStopButton() {
        controller.stop();
    }

    public void pressIncreaseBPM() {
        controller.increaseBPM();
    }

    public void pressDecreaseBPM() {
        controller.decreaseBPM();
    }

    public void setBPM(int bpm) {
        controller.setBpm(bpm);
    }


    @Override
    public void updateBPM() {

        int bpm = model.getBPM();

        if (bpm <= 0) {
            System.out.println("bpm is zero");
        } else {
            System.out.println("bpm is " + bpm);
        }

    }

    @Override
    public void updateBeat() {
        System.out.println("beat bar 튀기기");
    }
}
