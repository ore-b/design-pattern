package kr.co.oreb.dp.chapter12.compund.decorator;

import kr.co.oreb.dp.chapter12.compund.Barkable;
import kr.co.oreb.dp.chapter12.compund.observer.Observer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BarkCounter implements Barkable {

    public static int BARK_COUNT = 0;

    private final Barkable barkable;

    @Override
    public void bark() {
        barkable.bark();
        BARK_COUNT++;
    }


    @Override
    public void registerObserver(Observer observer) {
        barkable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        barkable.notifyObservers();
    }
}
