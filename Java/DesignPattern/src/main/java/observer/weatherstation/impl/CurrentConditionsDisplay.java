package observer.weatherstation.impl;

import observer.weatherstation.BulletinBoard;
import observer.weatherstation.Observer;
import observer.weatherstation.Subject;


/**
 * @program: Java
 * @description: 根据WeatherData对象显示当前观测值
 * @author: July
 * @create: 2018-09-27 15:42
 **/
public class CurrentConditionsDisplay implements Observer, BulletinBoard {
    private float temp;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
        //weatherData作为注册时使用
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        display();
    }
}
