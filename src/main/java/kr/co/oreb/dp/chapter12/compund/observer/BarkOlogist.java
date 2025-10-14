package kr.co.oreb.dp.chapter12.compund.observer;

public class BarkOlogist implements Observer {

    @Override
    public void update(BarkObservable barkObservable) {
        System.out.println("BarkOlogist update" + barkObservable);
    }
}
