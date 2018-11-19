package decorator.starbuzz;

/**
 * @program: Java
 * @description: 摩卡
 * @author: July
 * @create: 2018-10-04 14:18
 **/
public class Mocha extends Condiment {
    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     **/
    Beverage beverage;


    public Mocha(Beverage beverage) {
        // 想办法让被装饰者（饮料）被记录到实例变量中。
        // 这里的做法是把饮料当作构造器的参数，
        // 再由构造器将此饮料记录在实例变量中
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //完整的描述出一切餐单，首先利用委托的做法，得到一个叙述，然后再其后加上附加的叙述
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        //计算加摩卡的价钱，首先调用委托给呗装饰对象，以计算价钱，然后再加上摩卡的的价钱，得到最终结果
        return .20 + beverage.cost();
    }
}
