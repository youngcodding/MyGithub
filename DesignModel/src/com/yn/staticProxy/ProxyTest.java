package com.yn.staticProxy;


/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-22:16
 */
public class ProxyTest {
    public static void main(String[] args) {
        Farm farm = new Farmers();
        //实例化一个代理类
        Machine machine = new Machine(farm);
        machine.invoke();
    }
}
