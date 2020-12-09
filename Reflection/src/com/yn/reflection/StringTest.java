package com.yn.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/8-14:42
 */
public class StringTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;

        Constructor<?>[] con1 = stringClass.getConstructors();
        Field[] f1 = stringClass.getFields();
        Method[] methods = stringClass.getMethods();

        System.out.println("String类中公开的构造器有："+con1.length);
        System.out.println("String类中公开的属性有："+f1.length);
        System.out.println("String类中公开的方法有："+methods.length);
        System.out.println("****************************************");

        Constructor<?>[] con2 = stringClass.getDeclaredConstructors();
        Field[] f2 = stringClass.getDeclaredFields();
        Method[] methods2 = stringClass.getDeclaredMethods();

        System.out.println("String类中私有的构造器有："+(con2.length-con1.length));
        System.out.println("String类中私有的属性有："+(f2.length-f1.length));
        System.out.println("String类中私有的方法有："+(methods2.length-methods.length));
    }
}
