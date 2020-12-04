package com.yn.thread.sellTicket;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/3-16:22
 */
public class SellTicketThread implements Runnable {

    public int ticket = 20;
    @Override
    public  void run() {
        while (ticket>0){
            synchronized (this){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在出售倒数第"+ticket+"张票");
                    ticket--;
                }else {
                    System.out.println("票卖完了！！！");
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
