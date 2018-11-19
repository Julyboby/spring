package strategy.strategy.impl;

import strategy.strategy.FlyBehavior;

/**
 * @description: 鸭子会飞行为
 * @author: July
 * @create: 2018-09-26 11:56
 **/
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
