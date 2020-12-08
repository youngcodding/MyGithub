package com.yn.singleton;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-21:51
 */
public class SingletonFactory {
    /**
     * 单例模式--内部枚举类实现
     */
    private enum Enumsingleton {
        Singleton;
        private Singleton5 singleton5;

        private Enumsingleton() {
            singleton5 = new Singleton5();
        }

        public Singleton5 getInstance() {
            return singleton5;
        }
    }

    public static Singleton5 getIntance() {
        return Enumsingleton.Singleton.getInstance();
    }


}

class Singleton5 {
    public Singleton5() {
    }
}
