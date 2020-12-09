package com.yn.reflection;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-14:42
 */
public class GetClassLoader {
    public static void main(String[] args) {
        //取得系统类加载器（应用程序加载器）
        System.out.println("application classLoader:"+ClassLoader.getSystemClassLoader());
        //取得扩展类加载器（应用加载器的父加载器）
        System.out.println("extensions classLoaderL:"+ClassLoader.getSystemClassLoader().getParent());
        //取得引导类记载器
        System.out.println("boostrap classLoader:"+ClassLoader.getSystemClassLoader().getParent().getParent());
    }
}
