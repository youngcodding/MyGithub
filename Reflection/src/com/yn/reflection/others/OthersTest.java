package com.yn.reflection.others;

import com.yn.reflection.constructor.Emp;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/8-11:05
 */
public class OthersTest {
    public static void main(String[] args) {
        //获取反射对象
        Class<Emp> empClass = Emp.class;
        //反射获取类加载器
       /* ClassLoader classLoader = empClass.getClassLoader();
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        System.out.println(systemClassLoader);*/

      /*  Class<?>[] interfaces = empClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            //获取全路径名称
            System.out.println(anInterface.getName());
            //获取简单类名
            System.out.println(anInterface.getSimpleName());
        }*/
        Class<? super Emp> superclass = empClass.getSuperclass();
        System.out.println(superclass);
    }
}
