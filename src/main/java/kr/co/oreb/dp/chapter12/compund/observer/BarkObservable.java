package kr.co.oreb.dp.chapter12.compund.observer;

public interface BarkObservable {

    void registerObserver(Observer observer);

    void notifyObservers();

}
