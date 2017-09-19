package EnvironmentState.UseJDK;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
import EnvironmentState.Diy.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplay(Observable weatherData) {
        this.observable = weatherData;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
