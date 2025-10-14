package kr.co.oreb.dp.chapter12.compund.mvc.model;

import java.util.ArrayList;
import java.util.List;
import kr.co.oreb.dp.chapter12.compund.mvc.view.BPMObserver;
import kr.co.oreb.dp.chapter12.compund.mvc.view.BeatObserver;

public class BeatModel implements BeatModelInterface {

    private final List<BeatObserver> beatObservers = new ArrayList<>();
    private final List<BPMObserver> bpmObservers = new ArrayList<>();

    private boolean isPlaying;
    private int bpm;

    @Override
    public void init() {
        bpm = 90;
        isPlaying = false;
    }

    @Override
    public void on() {
        isPlaying = true;
        setBPM(90);
    }

    @Override
    public void off() {
        isPlaying = false;
        setBPM(0);
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        bpmObservers.forEach(BPMObserver::updateBPM);
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerBeatObserver(BeatObserver observer) {
        beatObservers.add(observer);
    }

    @Override
    public void unregisterObserver(BeatObserver observer) {
        beatObservers.remove(observer);
    }

    @Override
    public void registerBPMObserver(BPMObserver observer) {
        bpmObservers.add(observer);
    }

    @Override
    public void unregisterObserver(BPMObserver observer) {
        bpmObservers.remove(observer);
    }

}
