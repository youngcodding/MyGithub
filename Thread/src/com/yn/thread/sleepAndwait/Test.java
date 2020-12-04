package com.yn.thread.sleepAndwait;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/3-19:32
 */
public class Test {
    public static void main(String[] args) {
        //实例化一个有同步方法的对象
        Animal animal = new Animal();
        //创建两个线程访问同一个对象
        new Thread(new Producter(animal),"线程A").start();
        new Thread(new Customer(animal),"线程B").start();
    }
}
