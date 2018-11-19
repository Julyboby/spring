package strategy.strategy.impl;

import strategy.strategy.QuackBehavior;

/**
 * @program: 鸭子吱吱叫
 * @description:
 * @author: July
 * @create: 2018-09-26 14:47
 **/
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("<<Squeak>>");
    }
}
