package kr.co.oreb.dp.chapter12.compund.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements BarkObservable {

    private final List<Observer> observers = new ArrayList<>();

    private final BarkObservable barkObservable;

    public Observable(BarkObservable barkObservable) {
        this.barkObservable = barkObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(dog -> {
            dog.update(barkObservable);
        });
    }
}
