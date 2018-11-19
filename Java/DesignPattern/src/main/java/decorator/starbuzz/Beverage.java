package decorator.starbuzz;

/**
 * @program: Java
 * @description: 饮料类
 * @author: July
 * @create: 2018-10-04 11:48
 **/
public abstract class Beverage {
    protected static final int TALL = 1;
    protected static final int GRANDE = 2;
    protected static final int VENTI = 3;

    String description = "UnKnown Beverage";

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
