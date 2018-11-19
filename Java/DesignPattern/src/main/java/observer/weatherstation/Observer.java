package observer.weatherstation;

/**
 * @Description
 * 观察者接口
 * @Date 2018/09/27 12:03
 * @Author July
**/
public interface Observer {
    /**
     * @Description 当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者
     * @Param temp 温度
     * @Param humidity 湿度
     * @Param pressure 气压
     * @return
     * @Date 2018/09/27 15:51
     * @Author July
    **/
    void update(float temp,float humidity,float pressure);
}
