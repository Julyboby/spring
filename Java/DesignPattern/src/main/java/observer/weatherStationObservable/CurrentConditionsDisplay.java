package observer.weatherStationObservable;

import observer.weatherstation.BulletinBoard;

import java.util.Observable;
import java.util.Observer;


/**
 * @program: Java
 * @description: 根据WeatherData对象显示当前观测值
 * @author: July
 * @create: 2018-09-27 15:42
 **/
public class CurrentConditionsDisplay implements Observer, BulletinBoard {
    private float temperature;
    private float humidity;
    private Observable observable;

    /**
     * @return
     * @Description Observable当参数
     * @Param
     * @Date 2018/09/28 15:00
     * @Author July
     **/
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        //并将CurrentConditionsDisplay对像登记成为观察者
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    /**
     * @return
     * @Description 改变update()方法，增加Observable和数据对象作为参数
     * @Param
     * @Date 2018/09/28 15:02
     * @Author July
     **/
    public void update(Observable o, Object arg) {
        //先确定可观察者属于WeatherData类型
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            //利用getter方法获取温度和湿度测量值
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            //最后调用display()
            display();
        }
    }
}
