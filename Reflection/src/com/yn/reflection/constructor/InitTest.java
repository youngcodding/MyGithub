package com.yn.reflection.constructor;

import java.lang.reflect.Constructor;
import java.util.Date;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-16:19
 */
public class InitTest {
    public static void main(String[] args) throws Exception{
        //获取Class对象
        Class cls = Emp.class;
        //获取指定的构造方法
        //获取不是public修饰的构造方法
        Constructor con3 = cls.getDeclaredConstructor(Integer.class, String.class, String.class, String.class, Integer.class, Integer.class, Date.class);
        Constructor[] constructors = cls.getConstructors();
        System.out.println(constructors.length);

        //取消封装
        con3.setAccessible(true);
        Emp emp3 = (Emp) con3.newInstance(1008, "李四", "经理", "12000", 1001, 888, new Date());
        System.out.println(emp3);
    }
}
