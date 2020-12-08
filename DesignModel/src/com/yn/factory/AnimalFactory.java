package com.yn.factory;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-11:11
 */
public class AnimalFactory {
    //使用反射和泛型取得对象类对象
    public static <T> T getAnimal(Class<T> cls){
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
