package strategy.strategy;

import strategy.strategy.impl.FlyWithWings;
import strategy.strategy.impl.Quack;

/**
 * @description: 看起来像绿头鸭
 * @author: July
 * @create: 2018-09-26 11:41
 **/
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void dispaly() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
