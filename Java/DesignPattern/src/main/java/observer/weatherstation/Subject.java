package observer.weatherstation;

/**
 * @Description 主题接口，对象使用该接口注册为观察者，或者把自己从观察者中删除
 * @Date 2018/09/27 11:56
 * @Author July
**/
public interface Subject {

    /**
     * @Description 注册观察者
     * @Param
     * @return
     * @Date 2018/09/27 15:49
     * @Author July
    **/
    void registerObserver(Observer observer);

    /**
     * @Description 删除观察者
     * @Param
     * @return
     * @Date 2018/09/27 15:49
     * @Author July
    **/
    void removeObserver(Observer observer);

    /**
     * @Description 当主题状态改变时，这个方法会被调用，以通知所有的观察者
     * @Param
     * @return
     * @Date 2018/09/27 15:48
     * @Author July
    **/
    void notifyObserver();
}
