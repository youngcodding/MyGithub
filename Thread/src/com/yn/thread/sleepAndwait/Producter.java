package com.yn.thread.sleepAndwait;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/3-19:30
 */
public class Producter implements Runnable {

    private Animal animal;

    public Producter(){}

    public Producter(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        //调用生产者同步方法
        this.animal.set();
    }
}
