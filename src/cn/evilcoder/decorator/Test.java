package cn.evilcoder.decorator;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 11:05
 */
public class Test {
    public static void main(String[] args) {
        //����Ҫһ����ţ�̼�Ħ����Ũ������
        Beverage beverage = new Espresso();
        beverage = new MilkDecorator(beverage);
        beverage = new MochaDecorator(beverage);
        System.out.println("Your beverage:"+beverage.getDescription()+";price="+beverage.cost());
    }
}
