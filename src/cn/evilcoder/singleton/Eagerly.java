package cn.evilcoder.singleton;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 10:38
 */
public class Eagerly {
    private static Eagerly singleton = new Eagerly();
    private Eagerly(){}
    public Eagerly getSingleton(){
        return singleton;
    }
}
