package observer.weatherStationObservable;

import observer.weatherstation.BulletinBoard;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: Java
 * @description: 气象统计(显示最小 ， 平均和最大的观测值)
 * @author: July
 * @create: 2018-09-27 15:30
 **/
public class StatisticsDisplay implements BulletinBoard, Observer {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();

            this.tempSum += temp;
            this.numReadings++;
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
            display();
        }
    }
}
