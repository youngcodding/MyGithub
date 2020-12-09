package com.yn.reflection.parameter;

import com.yn.reflection.constructor.Emp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Date;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/8-9:45
 */
public class SetParameters {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class cls = Emp.class;
        //获取指定的构造方法
        //获取不是public修饰的构造方法
        Constructor con3 = cls.getDeclaredConstructor(Integer.class, String.class, String.class, String.class, Integer.class, Integer.class, Date.class);
        //取消封装
        con3.setAccessible(true);
        Emp emp3 = (Emp) con3.newInstance(1008, "李四", "经理", "12000", 1001, 888, new Date());
        //获取指定Method
        Method set = cls.getMethod("set", Integer.class, String.class, Date.class);
        //获取参数数组
        Parameter[] ps = set.getParameters();
        //声明一个数组
        Object[] params = new Object[ps.length];
        int index = 0;
        for (Parameter p : ps) {
            if ("Integer".equals(p.getType().getSimpleName())){
                params[index++]=1234;
            }else if ("String".equals(p.getType().getSimpleName())){
                params[index++]="员工";
            }else if("Date".equals(p.getType().getSimpleName())){
                params[index++]=new Date();
            }
        }
        //执行方法
        set.invoke(emp3,params);
        System.out.println(emp3);
    }
}
