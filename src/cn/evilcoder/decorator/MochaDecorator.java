package cn.evilcoder.decorator;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 10:59
 */
public class MochaDecorator extends CondimentDecorator {
    /**
     * 一种调料的具体类，摩卡，必须有一种饮料的实体属性
     */
    Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "-moka";
    }

    /**
     * 加摩卡需要另加0.2元
     * @return
     */
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
