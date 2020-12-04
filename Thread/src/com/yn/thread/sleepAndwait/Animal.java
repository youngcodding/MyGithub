package com.yn.thread.sleepAndwait;

import java.io.Serializable;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/3-19:28
 */
public class Animal implements Serializable {

    /**
     * 生产者调用的同步方法
     */
    public synchronized void set(){
        System.out.println(Thread.currentThread().getName()+"调用了set方法");
        try {
            //线程wait休眠
            //super.wait();
            //线程sleep休眠
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 消费者调用的同步方法
     */
    public synchronized void get(){
        System.out.println(Thread.currentThread().getName()+"调用了get方法");
    }
}
