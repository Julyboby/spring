package strategy.strategy;

import strategy.strategy.impl.FlyNoWay;
import strategy.strategy.impl.Quack;

/**
 * @description: 模型鸭子
 * @author: July
 * @create: 2018-09-26 15:25
 **/
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void dispaly() {
        System.out.println("I'm a model duck");
    }
}
