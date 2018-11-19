package strategy.strategy.impl;

import strategy.strategy.QuackBehavior;

/**
 * @program: 鸭子不会叫
 * @description:
 * @author: July
 * @create: 2018-09-26 14:45
 **/
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
