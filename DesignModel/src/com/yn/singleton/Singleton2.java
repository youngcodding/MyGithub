package com.yn.singleton;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-21:36
 */
public class Singleton2 {
    /*
    * 单例模式-延迟加载（懒汉式）
    * */
    public Singleton2(){}

    private static Singleton2 singleton2 = null;

    public static Singleton2 getInstance(){
        if (singleton2==null){
            singleton2 =  new Singleton2();
        }
        return  singleton2;
    }
}
