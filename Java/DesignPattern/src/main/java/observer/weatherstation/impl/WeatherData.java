package observer.weatherstation.impl;

import observer.weatherstation.Observer;
import observer.weatherstation.Subject;

import java.util.ArrayList;

/**
 * @program: Java
 * @description: 主题接口的实现类
 * @author: July
 * @create: 2018-09-27 11:58
 **/
public class WeatherData implements Subject {

    private ArrayList observers;

    /**
     * 温度
     **/
    private float temperature;

    /**
     * 湿度
     **/
    private float humidity;

    /**
     * 气压
     **/
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * @return
     * @Description 注册观察者时，将观察者添加至集合中即可
     * @Param
     * @Date 2018/09/27 16:22
     * @Author July
     **/
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * @return
     * @Description 将观察者从集合中删除
     * @Param
     * @Date 2018/09/27 16:23
     * @Author July
     **/
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    /**
     * @return
     * @Description 将状态告诉每一个观察者。
     * @Param
     * @Date 2018/09/27 16:23
     * @Author July
     **/
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * @Description 当从气象站获得的新观测值时，通知观察者
     * @Param
     * @return
     * @Date 2018/09/27 16:30
     * @Author July
    **/
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     * @Description 测试布告板
     * @Param
     * @return
     * @Date 2018/09/27 16:33
     * @Author July
    **/
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
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
