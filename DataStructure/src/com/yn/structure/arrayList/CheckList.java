package com.yn.structure.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/11-9:24
 */
public class CheckList {
    /*检测ArrayList和LinkedList在插入数据和查询数据的性能区别*/
    public static void main(String[] args) {
      /*  checkArrayListAdd();
        checkLinkedListAdd();*/
      checkArrayListGet();
      checkLinkedListGet();
    }

    /**
     * 测试ArrayList插入数据耗时
     */
    public static void checkArrayListAdd(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 50000000; i++) {
            list.add("abc");
        }
        //取得当前时间 毫秒
        long start = System.currentTimeMillis();
        //插入数据
        list.add(2,"mmp");
        //取得结束时间 毫秒
        long end = System.currentTimeMillis();
        System.out.println("ArrayList插入数据耗时："+(end-start));
    }

    /**
     * 测试LinkedList插入数据耗时
     */
    public static void checkLinkedListAdd(){
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 50000000; i++) {
            list.add("abc");
        }
        //取得当前时间 毫秒
        long start = System.currentTimeMillis();
        //插入数据
        list.add(2,"mmp");
        //取得结束时间 毫秒
        long end = System.currentTimeMillis();
        System.out.println("LinkedList插入数据耗时："+(end-start));
    }

    /**
     * 测试ArrayList取得数据耗时
     */
    public static void checkArrayListGet(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 50000000; i++) {
            list.add("abc");
        }
        //取得当前时间 毫秒
        long start = System.currentTimeMillis();
        //插入数据
        list.get(25000000);
        //取得结束时间 毫秒
        long end = System.currentTimeMillis();
        System.out.println("ArrayList获取数据耗时："+(end-start));
    }

    /**
     * 测试LinkedList获取数据耗时
     */
    public static void checkLinkedListGet(){
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 50000000; i++) {
            list.add("abc");
        }
        //取得当前时间 毫秒
        long start = System.currentTimeMillis();
        //插入数据
        list.get(25000000);
        //取得结束时间 毫秒
        long end = System.currentTimeMillis();
        System.out.println("LinkedList获取数据耗时："+(end-start));
    }
}
