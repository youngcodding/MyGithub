package com.yn.templet;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-10:09
 */
public class Chinese extends TempletPattern {

    /**
     * 中国人吃饭的方式用筷子
     */
    @Override
    public void haveMeal() {
        System.out.println("用筷子吃饭！");
    }

    @Override
    public void doHaveFruit() {
        System.out.println("饭后吃苹果！");
    }
}
