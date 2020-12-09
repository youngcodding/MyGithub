package com.yn.reflection;

import com.yn.reflection.constructor.Emp;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/8-9:02
 */
public class ClassTest {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class cls = Emp.class;
        //获取指定的构造方法
        //获取不是public修饰的构造方法
        Constructor con3 = cls.getDeclaredConstructor(Integer.class, String.class, String.class, String.class, Integer.class, Integer.class, Date.class);
        //取消封装
        con3.setAccessible(true);
        Emp emp3 = (Emp) con3.newInstance(1008, "李四", "经理", "12000", 1001, 888, new Date());
        jsonObject(emp3);
    }

    public static void jsonObject(Object o) throws Exception {
        //获取传入对象的Class类对象
        Class<?> cls = o.getClass();
        //通过Class类对象获取类名
        String simpleName = cls.getSimpleName();
        //开始拼接字符串
        StringBuffer sb = new StringBuffer('"'+simpleName+'"');
        sb.append(":{");
        //获取所有属性名
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            //取消属性私有封装
            field.setAccessible(true);
            if (i + 1 == fields.length) {
                sb.append('"'+field.getName() +'"'+ ":" +'"'+ field.get(o)+'"');
            }else {
                sb.append('"'+field.getName() +'"'+ ":" +'"'+ field.get(o)+'"'+",");
            }
        }
        sb.append("}");
        System.out.println(sb.toString());
    }
}
