package strategy.strategy.impl;

import strategy.strategy.FlyBehavior;

/**
 * @description: 不会飞
 * @author: July
 * @create: 2018-09-26 14:41
 **/
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I'm can't fly");
    }
}
