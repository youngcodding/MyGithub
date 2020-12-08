package com.yn.decoration;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-8:38
 */
public class Lipstick extends Decorator {

    public Lipstick(MakeUpAnimal makeUpAnimal) {
        //调用了父类的构造方法，相当于把makeUpAnimal传递给了Decorator
        super(makeUpAnimal);
    }

    private void maleLipstick(){
        System.out.println("口红化妆：简单的涂上淡红色的口红！");
    }

    @Override
    public void make() {
        super.make();
        this.maleLipstick();
    }
}
