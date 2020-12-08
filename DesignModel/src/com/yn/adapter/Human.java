package com.yn.adapter;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-10:43
 */
public class Human extends AdapterAnimal {
    /*不需要重写飞行和爬行这两个方法*/
    @Override
    public void eat() {
        System.out.println("吃饭！");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉！");
    }

    @Override
    public void walk() {
        System.out.println("散步！");
    }
}

