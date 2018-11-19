package strategy.strategy.impl;

import strategy.strategy.FlyBehavior;

/**
 * @description: 火箭动力的飞行行为
 * @author: July
 * @create: 2018-09-26 15:29
 **/
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
