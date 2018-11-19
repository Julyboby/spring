import strategy.strategy.Duck;
import strategy.strategy.MallardDuck;
import strategy.strategy.ModelDuck;
import strategy.strategy.impl.FlyRocketPowered;

/**
 * @program: Java
 * @description: 模拟鸭子的行为
 * @author: July
 * @create: 2018-09-26 14:54
 **/
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.dispaly();
        mallard.swim();

        System.out.println("---------------------------");

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.dispaly();
        modelDuck.swim();
    }
}
