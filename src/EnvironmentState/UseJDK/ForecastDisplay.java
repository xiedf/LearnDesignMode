package EnvironmentState.UseJDK;

import EnvironmentState.Diy.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
