package strategy.strategy;

/**
 * @description: 鸭子类
 * @author: July
 * @create: 2018-09-26 11:33
 **/
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * @Description 飞行为
     * @Param
     * @return
     * @Date 2018/09/26 11:52
     * @Author July
    **/
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * @Description 叫行为
     * @Param
     * @return
     * @Date 2018/09/26 11:52
     * @Author July
    **/
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * @Description 外在
     * @Param
     * @return
     * @Date 2018/09/26 11:52
     * @Author July
    **/
    public abstract void dispaly();

    /**
     * @Description 游泳
     * @Param
     * @return
     * @Date 2018/09/26 11:52
     * @Author July
    **/
    public void swim() {
        System.out.println("All strategy.strategy float, even decoys!");
    }
}
