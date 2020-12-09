package com.yn.reflection.proxy;


import com.sun.org.apache.xpath.internal.SourceTree;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-22:16
 */
public class ProxyTest {
    public static void main(String[] args) throws Exception {
        //创建一个真实的主体类对象
        Farm farm = new Farmers();
        //实例化一个代理类对象
        InvocationHandler handler = new Machine(farm);
        //取得被代理后的对象
        Farm proxyFarm =(Farm) Proxy.newProxyInstance(farm.getClass().getClassLoader(), farm.getClass().getInterfaces(), handler);
        //执行方法
        proxyFarm.plant();
    }
}
