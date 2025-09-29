package kr.co.oreb.dp.chapter02.observer;

public interface Observer {

    //온도,습도,압력
    void update(float temp, float humidity, float pressure);

}
