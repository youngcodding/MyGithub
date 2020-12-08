package com.yn.templet;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-10:11
 */
public class European extends TempletPattern {
    /**
     * 欧洲人使用刀叉吃饭
     */
    @Override
    public void haveMeal() {
        System.out.println("使用刀叉吃饭！");
    }

    @Override
    public void doHaveFruit() {
        System.out.println("饭后吃草莓！");
    }
}
