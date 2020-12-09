package com.yn.reflection.field;

import com.yn.reflection.constructor.Emp;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-20:44
 */
public class FieldTest {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class cls = Emp.class;
        //获取指定的构造方法
        //获取不是public修饰的构造方法
        Constructor con3 = cls.getDeclaredConstructor(Integer.class, String.class, String.class, String.class, Integer.class, Integer.class, Date.class);
        //取消封装
        con3.setAccessible(true);
        Emp emp3 = (Emp) con3.newInstance(1008, "李四", "经理", "12000", 1001, 888, new Date());
      //  Field field = cls.getDeclaredField("eno");
        Field[] fields = cls.getDeclaredFields();
        for (Field field:fields){
            //取消属性封装
            field.setAccessible(true);
            System.out.println(field.getName() +"-->"+field.get(emp3));
        }
    }
}
