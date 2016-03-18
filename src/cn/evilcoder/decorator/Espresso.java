package cn.evilcoder.decorator;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 10:57
 */
public class Espresso extends Beverage{
    /**
     * �����������-Ũ������
     *
     */

    public Espresso() {
        description = "Espresso coffee";
    }

    @Override
    public double cost() {
        return 10;
    }
}
