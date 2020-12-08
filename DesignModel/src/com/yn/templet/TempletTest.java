package com.yn.templet;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-10:13
 */
public class TempletTest {
    public static void main(String[] args) {
        TempletPattern chinese = new Chinese();
        chinese.enjoy();
        System.out.println("**************************");
        TempletPattern european = new European();
        european.enjoy();
        System.out.println("**************************");
        TempletPattern african = new African();
        african.enjoy();
        System.out.println("**************************");
    }
}
