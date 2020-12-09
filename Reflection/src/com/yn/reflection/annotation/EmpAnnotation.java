package com.yn.reflection.annotation;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.*;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/8-10:16
 */
//指定EmpAnnotation注解的使用范围
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.LOCAL_VARIABLE})
//指定注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
//表示注解可以被子类继承
@Inherited
public @interface EmpAnnotation {
    String eno() default "1001";
    String name() default "yn";
}
