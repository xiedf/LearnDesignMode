package EnvironmentState.UseJDK;

import java.util.Observable;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humi, float pres) {
        this.temperature = temp;
        this.humidity = humi;
        this.pressure = pres;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
