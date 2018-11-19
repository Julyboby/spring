package strategy.strategy.impl;

import strategy.strategy.QuackBehavior;

/**
 * @program: 鸭子呱呱叫
 * @description:
 * @author: July
 * @create: 2018-09-26 11:55
 **/
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
