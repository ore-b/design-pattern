package kr.co.oreb.dp.chapter12.compund.dog;

import kr.co.oreb.dp.chapter12.compund.dog.observer.BarkObservable;

public interface Barkable extends BarkObservable {

    void bark();

}
