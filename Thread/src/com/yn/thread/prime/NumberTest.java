package com.yn.thread.prime;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/3-15:59
 */
public class NumberTest {
    public static void main(String[] args) {
        NumberThread n1 = new NumberThread(2, 100000);
        NumberThread n2 = new NumberThread(100000, 200000);
        new Thread(n1).start();
        new Thread(n2).start();

    }
}
