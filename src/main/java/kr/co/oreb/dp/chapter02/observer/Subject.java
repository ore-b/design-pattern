package kr.co.oreb.dp.chapter02.observer;


public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
