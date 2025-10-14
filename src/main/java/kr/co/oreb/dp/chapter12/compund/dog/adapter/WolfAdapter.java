package kr.co.oreb.dp.chapter12.compund.dog.adapter;


import kr.co.oreb.dp.chapter12.compund.dog.Barkable;
import kr.co.oreb.dp.chapter12.compund.dog.observer.Observable;
import kr.co.oreb.dp.chapter12.compund.dog.observer.Observer;

public class WolfAdapter implements Barkable {

    private final Wolf wolf;

    private final Observable observable;

    public WolfAdapter(Wolf wolf) {
        this.wolf = wolf;
        this.observable = new Observable(this);
    }

    @Override
    public void bark() {
        wolf.howlable();
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
