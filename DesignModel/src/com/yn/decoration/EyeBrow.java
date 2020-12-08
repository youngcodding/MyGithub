package com.yn.decoration;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-8:44
 */
public class EyeBrow extends Decorator {

    public EyeBrow(MakeUpAnimal makeUpAnimal) {
        super(makeUpAnimal);
    }

    private void makeEyeBrow(){
        System.out.println("眉毛化妆：简单的用眉笔画一下！");
    }

    @Override
    public void make() {
        super.make();
        this.makeEyeBrow();
    }
}
