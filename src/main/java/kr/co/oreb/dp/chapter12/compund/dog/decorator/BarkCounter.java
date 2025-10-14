package kr.co.oreb.dp.chapter12.compund.dog.decorator;

import kr.co.oreb.dp.chapter12.compund.dog.Barkable;
import kr.co.oreb.dp.chapter12.compund.dog.observer.Observer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BarkCounter implements Barkable {

    public static int BARK_COUNT = 0;

    private final Barkable dog;

    @Override
    public void bark() {
        dog.bark();
        BARK_COUNT++;
    }


    @Override
    public void registerObserver(Observer observer) {
        dog.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        dog.notifyObservers();
    }
}
