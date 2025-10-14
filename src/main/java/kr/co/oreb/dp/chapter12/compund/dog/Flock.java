package kr.co.oreb.dp.chapter12.compund.dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kr.co.oreb.dp.chapter12.compund.dog.observer.BarkObservable;
import kr.co.oreb.dp.chapter12.compund.dog.observer.Observer;

public class Flock implements Barkable {

    private final List<Barkable> barkers = new ArrayList<>();

    public void add(Barkable barkable) {
        barkers.add(barkable);
    }

    @Override
    public void bark() {
        Iterator<Barkable> iterator = barkers.iterator();

        while (iterator.hasNext()) {
            Barkable barkable = iterator.next();
            barkable.bark();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        barkers.forEach(barker -> barker.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
        barkers.forEach(BarkObservable::notifyObservers);
    }
}
