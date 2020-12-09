package com.yn.reflection;

import java.util.Date;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-14:03
 */
public class GetClass {
    public static void main(String[] args) throws Exception {
        /*三种方式获取Class类对象*/
        Date date = new Date();
        //getClass()方法
        Class<? extends Date> cls = date.getClass();
        //Class类的forName()方法
        Class<?> aClass = Class.forName("java.util.Date");
        //本类.class属性
        Class<Date> dateClass = Date.class;
    }
}
