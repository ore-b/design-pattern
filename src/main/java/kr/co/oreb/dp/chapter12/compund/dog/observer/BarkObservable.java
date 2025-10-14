package kr.co.oreb.dp.chapter12.compund.dog.observer;

public interface BarkObservable {

    void registerObserver(Observer observer);

    void notifyObservers();

}
