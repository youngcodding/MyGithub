package com.yn.reflection.annotation;

import com.yn.reflection.constructor.Emp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/8-10:15
 */
public class GetAnnotation {
    public static void main(String[] args) throws Exception {
        //取得反射对象
        Class<Emp> cls = Emp.class;
        //读取emp类上的注解
        Annotation annotation = cls.getAnnotation(SuppressWarnings.class);
        System.out.println(annotation);
        //读取set方法上的注解
        Method set = cls.getMethod("set", Integer.class, String.class, Date.class);
        EmpAnnotation ma = set.getAnnotation(EmpAnnotation.class);
        System.out.println(ma.eno());
        System.out.println(ma.name());
    }
}
