package decorator.starbuzz;

/**
 * @program: Java
 * @description: 奶泡
 * @author: July
 * @create: 2018-10-04 14:34
 **/
public class Whip extends Condiment {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
