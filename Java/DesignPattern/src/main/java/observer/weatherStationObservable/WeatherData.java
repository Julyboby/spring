package observer.weatherStationObservable;

import java.util.Observable;

/**
 * @program: Java
 * @description: 主题接口的实现类
 * @author: July
 * @create: 2018-09-27 11:58
 **/
public class WeatherData extends Observable {

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
    }

    /**
     * @return
     * @Description 当从气象站获得的新观测值时，通知观察者
     * @Param
     * @Date 2018/09/27 16:30
     * @Author July
     **/
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * @return
     * @Description 测试布告板
     * @Param
     * @Date 2018/09/27 16:33
     * @Author July
     **/
    public void setMeasurements(float temperature, float humidity, float pressure) {
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
