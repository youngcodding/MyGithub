package com.yn.lambda.demo01;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-10:51
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("多线程程序启动了");
    }
}
