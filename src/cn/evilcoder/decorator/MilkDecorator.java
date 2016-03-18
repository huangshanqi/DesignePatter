package cn.evilcoder.decorator;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 11:02
 */
public class MilkDecorator extends CondimentDecorator{
    /**
     * 另一种调料，牛奶
     */
    Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+"-milk";
    }

    /**
     * 加牛奶多加0.5
     * @return
     */
    @Override
    public double cost() {
        return 0.5+beverage.cost();
    }
}
