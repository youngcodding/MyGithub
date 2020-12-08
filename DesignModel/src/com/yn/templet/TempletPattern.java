package com.yn.templet;

/**
 * @author yn
 * @class MyGithub
 * @describe 定义吃饭这一系列流程的模板骨架
 * @date 2020/12/7-10:02
 */
public abstract class TempletPattern {
    /**
     * 统一方法 不能重写
     */
    public final void  placeOrder(){
        System.out.println("下订单");
    }

    /**
     * 抽象方法- 吃饭的方式 必须重写
     */
    public abstract void haveMeal();


    /**
     * 子类可以选择性的覆写，如果不覆写就默认吃香蕉
     * 这种方法在模板类中叫做钩子方法
     */
    public void doHaveFruit(){
        System.out.println("饭后水果：香蕉");
    }

    /**
     * 只能使用现金支付
     */
    public final void acount(){
        System.out.println("使用现金支付！");
    }

    public void enjoy(){
        this.placeOrder();
        this.haveMeal();
        this.doHaveFruit();
        this.acount();
    }
}
