package decorator.starbuzz;

/**
 * @program: Java
 * @description: 深焙咖啡
 * @author: July
 * @create: 2018-10-04 11:53
 **/
public class DarkRoast extends Beverage {

    public DarkRoast() {
        //为了设置饮料的描述，所以有构造器。注意：description实列变量继承自Beverage
        description = "DarkRoast coffee";
    }

    /**
     * @return
     * @Description 最后需要计算Espresso的价钱，现在不需要管调料的价钱，所以直接返回价钱
     * @Param
     * @Date 2018/10/04 11:54
     * @Author July
     **/
    @Override
    public double cost() {
        return .99;
    }
}
