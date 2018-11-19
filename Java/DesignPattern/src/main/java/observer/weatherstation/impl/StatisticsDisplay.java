package observer.weatherstation.impl;

import observer.weatherstation.BulletinBoard;
import observer.weatherstation.Observer;

/**
 * @program: Java
 * @description: 气象统计(显示最小，平均和最大的观测值)
 * @author: July
 * @create: 2018-09-27 15:30
 **/
public class StatisticsDisplay implements BulletinBoard, Observer {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
