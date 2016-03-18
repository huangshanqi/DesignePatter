package cn.evilcoder.decorator;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 11:02
 */
public class MilkDecorator extends CondimentDecorator{
    /**
     * ��һ�ֵ��ϣ�ţ��
     */
    Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+"-milk";
    }

    /**
     * ��ţ�̶��0.5
     * @return
     */
    @Override
    public double cost() {
        return 0.5+beverage.cost();
    }
}
