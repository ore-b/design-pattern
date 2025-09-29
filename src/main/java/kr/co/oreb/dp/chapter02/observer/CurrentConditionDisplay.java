package kr.co.oreb.dp.chapter02.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final Subject weatherData;


    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println(
            "Current Condition Display, temperature : "
                + temperature + ", humidity : " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
