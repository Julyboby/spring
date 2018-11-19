package observer.weatherstation.impl;

import observer.weatherstation.BulletinBoard;
import observer.weatherstation.Observer;

/**
 * @program: Java
 * @description: 目前状况(显示基于观测值的其他内容)
 * @author: July
 * @create: 2018-09-27 15:29
 **/
public class ThirdPartyDisplay implements BulletinBoard, Observer {
    public void display() {

    }


    public void update(float temp, float humidity, float pressure) {

    }
}
