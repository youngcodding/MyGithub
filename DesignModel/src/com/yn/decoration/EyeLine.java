package com.yn.decoration;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-8:46
 */
public class EyeLine extends Decorator {
    public EyeLine(MakeUpAnimal makeUpAnimal) {
        super(makeUpAnimal);
    }

    private void makeEyeLine(){
        System.out.println("眼线化妆：简单画一下眼线吧！");
    }

    @Override
    public void make() {
        super.make();
        this.makeEyeLine();
    }
}
