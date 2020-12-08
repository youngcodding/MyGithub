package com.yn.decoration;

/**
 * @author yn
 * @class MyGithub
 * @describe 装饰类
 * @date 2020/12/7-8:37
 */
public class Decorator implements MakeUpAnimal {
    private MakeUpAnimal makeUpAnimal;

    public Decorator(MakeUpAnimal makeUpAnimal) {

        this.makeUpAnimal = makeUpAnimal;
    }

    @Override
    public void make() {
        this.makeUpAnimal.make();
    }
}
