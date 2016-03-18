package cn.evilcoder.decorator;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 10:52
 */
public abstract class Beverage {
    /**
     * ���ϵĳ�����
     * �����������ͼ۸�
     */
    String description  = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
