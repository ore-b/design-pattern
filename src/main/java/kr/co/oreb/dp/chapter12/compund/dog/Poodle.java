package kr.co.oreb.dp.chapter12.compund.dog;

import kr.co.oreb.dp.chapter12.compund.dog.observer.Observable;
import kr.co.oreb.dp.chapter12.compund.dog.observer.Observer;

public class Poodle implements Barkable {

    private final Observable observable;

    public Poodle() {
        this.observable = new Observable(this);
    }

    @Override
    public void bark() {
        System.out.println("푸르들들들~");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
