package com.yn.factory;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-11:14
 */
public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
}
