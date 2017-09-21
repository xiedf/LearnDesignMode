package EnvironmentState.Diy;

import javax.security.auth.login.Configuration;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForeacastDisplay foreacastDisplay = new ForeacastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
