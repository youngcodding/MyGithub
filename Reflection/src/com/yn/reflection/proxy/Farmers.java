package com.yn.reflection.proxy;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-22:11
 */
public class Farmers implements Farm {
    //真实的主体类
    @Override
    public void plant() {
        System.out.println("出售卖钱");
    }
}
