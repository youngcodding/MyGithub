package com.yn.thread.sleepAndwait;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/3-19:31
 */
public class Customer implements Runnable {
    private Animal animal;
    public Customer(){}

    public Customer(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        //调用消费者同步方法
        this.animal.get();
    }
}
