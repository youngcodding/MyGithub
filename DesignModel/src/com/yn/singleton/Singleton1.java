package com.yn.singleton;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-21:32
 */
public class Singleton1 {
    /*
     * 单例模式-饿汉式
     * */
    private static Singleton1 singleton1 = new Singleton1();

    public Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
