package com.yn.singleton;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-21:44
 */
public class Singleton202 {
    /**
     * 单例模式--延迟加载模式-加synchronize--双重判定避免被锁
     * 在方法上加synchronized同步锁或是用同步代码块对类加同步锁，此种方式虽然解决了多个实例对象问题，
     * 但是该方式运行效率却很低下，下一个线程想要获取对象，就必须等待上一个线程释放锁之后，才可以继续运行。
     * 使用双重检查进一步做了优化，可以避免整个方法被锁，只对需要锁的代码部分加锁，可以提高执行效率。
     */

    //私有构造
    private Singleton202(){}
    //初始为null
    private static Singleton202 singleton202 = null;
    //外部调用才实例化
    public static Singleton202 getInstance(){
        //双重判定 避免被锁
        if (singleton202==null){
            synchronized (Singleton202.class){
                if (singleton202==null){
                    singleton202 = new Singleton202();
                }
            }
        }
        return singleton202;
    }
}
