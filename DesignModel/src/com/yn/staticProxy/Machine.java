package com.yn.staticProxy;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-22:24
 */
public class Machine {
    private Farm farm;

    public Machine(Farm farm) {
        this.farm = farm;
    }

    public void invoke(){
        System.out.println("播种！");
        System.out.println("收割");
        this.farm.plant();
        System.out.println("耕地，等下一次播种");
    }

}
