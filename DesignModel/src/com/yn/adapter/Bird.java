package com.yn.adapter;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-10:45
 */
public class Bird extends AdapterAnimal {
    /*不需要重写爬行这个方法*/
    @Override
    public void eat() {
        System.out.println("吃虫子！");
    }

    @Override
    public void sleep() {
        System.out.println("休息！");
    }

    @Override
    public void walk() {
        System.out.println("行走！");
    }

    @Override
    public void flying() {
        System.out.println("飞行！");
    }
}
