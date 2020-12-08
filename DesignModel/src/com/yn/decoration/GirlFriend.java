package com.yn.decoration;

/**
 * @author yn
 * @class MyGithub
 * @describe 需要被装饰的女朋友类
 * @date 2020/12/7-8:35
 */
public class GirlFriend implements MakeUpAnimal {

    /**
     * 被装饰的的方法
     */
    @Override
    public void make() {
        System.out.println("简单的洗漱！");
    }
}
