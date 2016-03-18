package cn.evilcoder.decorator;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 10:52
 */
public abstract class Beverage {
    /**
     * 饮料的抽象类
     * 饮料有描述和价格
     */
    String description  = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
