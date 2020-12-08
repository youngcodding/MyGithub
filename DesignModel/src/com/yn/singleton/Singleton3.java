package com.yn.singleton;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-21:45
 */
public class Singleton3 {
    /**
     * 单例模式--静态内部类
     * 静态内部类虽然保证了单例在多线程并发下的线程安全性，但是在遇到序列化对象时，
     * 默认的方式运行得到的结果就是多例的。这种情况不多做说明了，使用时请注意。
     */

    //私有构造
    private Singleton3(){}

    //静态内部类
    private static class InnerObject{
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static Singleton3 getIntance(){
        return InnerObject.singleton3;
    }
}
