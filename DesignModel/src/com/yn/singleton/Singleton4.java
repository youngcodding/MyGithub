package com.yn.singleton;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-21:48
 */
public class Singleton4 {
    /**
     * 单例模式--静态代码static
     */

    public Singleton4(){}

    private static Singleton4 singleton4 = null;

    static {
        singleton4 = new Singleton4();
    }

    public static Singleton4  getInstance(){
        return singleton4;
    }
}
