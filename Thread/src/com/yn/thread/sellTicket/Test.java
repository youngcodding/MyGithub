package com.yn.thread.sellTicket;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/3-16:24
 */
public class Test {
    public static void main(String[] args) {
        SellTicketThread s = new SellTicketThread();

        new Thread(s,"窗口1").start();
        new Thread(s,"窗口2").start();
        new Thread(s,"窗口3").start();
    }
}
