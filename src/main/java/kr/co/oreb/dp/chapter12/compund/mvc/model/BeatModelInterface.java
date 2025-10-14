package kr.co.oreb.dp.chapter12.compund.mvc.model;

import kr.co.oreb.dp.chapter12.compund.mvc.view.BPMObserver;
import kr.co.oreb.dp.chapter12.compund.mvc.view.BeatObserver;

public interface BeatModelInterface {

    void init();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerBeatObserver(BeatObserver observer);

    void unregisterObserver(BeatObserver observer);

    void registerBPMObserver(BPMObserver observer);

    void unregisterObserver(BPMObserver observer);

}
