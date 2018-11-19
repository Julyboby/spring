package decorator.starbuzz;

/**
 * @program: Java
 * @description: 调料
 * @author: July
 * @create: 2018-10-04 11:50
 **/
public abstract class Condiment extends Beverage {

    /**
     * @Description 所有的调料装饰者都必须重新实现getDescription方法
     * @Param
     * @return
     * @Date 2018/10/04 11:52
     * @Author July
    **/
    @Override
    public abstract String getDescription();
}
