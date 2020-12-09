package com.yn.reflection.method;

import com.yn.reflection.constructor.Emp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-21:51
 */
public class MethodTest {
    public static void main(String[] args)throws Exception {
        //获取Class对象
        Class cls = Emp.class;
        //获取指定的构造方法
        //获取不是public修饰的构造方法
        Constructor con3 = cls.getDeclaredConstructor(Integer.class, String.class, String.class, String.class, Integer.class, Integer.class, Date.class);
        //取消封装
        con3.setAccessible(true);
        Emp emp3 = (Emp) con3.newInstance(1008, "李四", "经理", "12000", 1001, 888, new Date());

        Method[] methods = cls.getMethods();
        System.out.println(methods.length);
        //取得setEno的Method对象
        Method method = cls.getDeclaredMethod("setEno", Integer.class);
        //取消私有封装
        method.setAccessible(true);
        //执行setEno方法
        method.invoke(emp3,1001);
        //取得表示getEno的Method对象
        Method method1 = cls.getDeclaredMethod("getEno");
        //取消私有封装
        method1.setAccessible(true);
        //执行getEno方法
        Integer eno = (Integer) method1.invoke(emp3);
        System.out.println("编号是："+eno);
    }
}
