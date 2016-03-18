package cn.evilcoder.decorator;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 10:59
 */
public class MochaDecorator extends CondimentDecorator {
    /**
     * һ�ֵ��ϵľ����࣬Ħ����������һ�����ϵ�ʵ������
     */
    Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "-moka";
    }

    /**
     * ��Ħ����Ҫ���0.2Ԫ
     * @return
     */
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
