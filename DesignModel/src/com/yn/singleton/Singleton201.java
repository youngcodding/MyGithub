package com.yn.singleton;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-21:42
 */
public class Singleton201 {
    /**
     * 单例模式--延迟加载模式-加synchronize
     * 上个示例虽然用延迟加载方式实现了懒汉式单例，但在多线程环境下会产生多个single对象，如何改造请看以下方式:
     */
    //私有构造
    private Singleton201(){}
    //初始为null
    private static Singleton201 singleton201 = null;
    //外部调用才实例化
    public static Singleton201 getInstance(){

        synchronized (Singleton201.class){
            if (singleton201==null){
                singleton201 = new Singleton201();
            }
        }
        return singleton201;
    }
}
