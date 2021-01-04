package com.yn.Arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2021/1/4-20:33
 */
public class ArraysMethod01 {
    /*
    * List<T> asList(T... a) 可以将一个将数组转换为集合
    * */
    public static void main(String[] args) {
        test04();
    }

    /**
     * 参数为不定个数
     */
    public static void  test01(){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }

    /**
     * 参数为数组
     */
    public static void  test02(){
        String[] strs = {"a","b","c","d"};
        List<String> stringList = Arrays.asList(strs);
        for (String str : stringList) {
            System.out.println(str);
        }

    }

    /**
     * 任意改变原数组或者生成后的集合
     * 数组和集合都会相应改变
     */
    public static void  test03(){
        String[] strs = {"a","b","c","d"};
        System.out.println(Arrays.toString(strs));
        List<String> stringList = Arrays.asList(strs);
        for (String str : stringList) {
            System.out.println(str);
        }
        //改变原始数组的某个元素
        strs[1]="x";
        System.out.println(Arrays.toString(strs));
        for (String str : stringList) {
            System.out.println(str);
        }

        //改变转换集合中的某个元素
        stringList.set(3,"y");
        System.out.println(Arrays.toString(strs));
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    /**
     * asList方法转化的集合 是不能删除和添加元素的 会抛出异常
     */
    public static void  test04(){
        String[] strs = {"a","b","c","d"};
        System.out.println(Arrays.toString(strs));
        List<String> stringList = Arrays.asList(strs);
        for (String str : stringList) {
            System.out.println(str);
        }
       /* stringList.add("z");*/
        stringList.remove(1);
    }
}
