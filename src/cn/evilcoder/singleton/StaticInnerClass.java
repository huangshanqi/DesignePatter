package cn.evilcoder.singleton;

/**
 * User: Huangshanqi
 * Date: 2016/3/18
 * Time: 10:25
 */
public class StaticInnerClass {

    private static class SingletonHolder{
        private static final StaticInnerClass singleton = new StaticInnerClass();
    }

    private StaticInnerClass(){

    }

    public static StaticInnerClass getSingleton(){
        return SingletonHolder.singleton;
    }
}
