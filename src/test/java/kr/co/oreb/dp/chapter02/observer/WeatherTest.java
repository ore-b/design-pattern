package kr.co.oreb.dp.chapter02.observer;

import org.junit.jupiter.api.Test;

public class WeatherTest {

    @Test
    public void weatherTest() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
