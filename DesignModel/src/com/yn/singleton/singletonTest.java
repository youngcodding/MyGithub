package com.yn.singleton;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-21:34
 */
public class singletonTest {
    public static void main(String[] args) {
        //测试饿汉式
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());
        System.out.println("*************************");
        //测试懒汉式
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
    }
}
