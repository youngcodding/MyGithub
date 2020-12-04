package com.yn.thread.prime;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/3-15:53
 */
public class NumberThread implements Runnable {

    private int begin; //开始值
    private int end;//结束值
    public int count = 0;//个数

    public NumberThread(){}

    public NumberThread(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = this.begin;i<=this.end;i++){
            boolean isPrime = true;
            if (i==2){

            }else if (i==1||i%2==0){
                isPrime = false;
            }else {
                for (int m = 2; m < i; m++) {
                    if (i%m==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                this.count++;
            }
        }
        System.out.println(this.begin+"~"+this.end+"之间的素数一共有:"+this.count+"个");
    }
}
