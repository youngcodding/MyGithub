package com.yn.lambda.demo01;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-10:51
 */
public class ThreadTest {
    public static void main(String[] args) {
        //普通方法启动一个多线程
        new Thread(new MyRunnable()).start();

        //使用匿名内部类启动一个多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();

        //使用lambda表达式
        new Thread(()->{
            System.out.println("多线程程序启动了");
        }).start();
    }
}
