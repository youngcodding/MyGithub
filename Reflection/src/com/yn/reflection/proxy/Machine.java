package com.yn.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/5-22:24
 */
public class Machine implements InvocationHandler {//代理主体类
    //此时就不存在耦合了，可以代理任何对象
    private Object object;

    public Machine(Object object) {
        this.object= object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("播种！");
        System.out.println("收割");
       Object result = method.invoke(this.object,args);
        System.out.println("耕地，等下一次播种");
        return null;
    }
}
