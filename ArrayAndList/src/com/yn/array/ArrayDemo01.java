package com.yn.array;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/14-22:02
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        /*
        * 在java中允许将一个数组变量拷贝给另外一个数组变量
        * 此时两个数组变量指向的是同一个数组
        * 一个修改数组的内容 另一个也会修改*/
        int[] smallPrimes = {2,3,5,7,11,13};
        int [] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12;
        /*这个会输出原来的13 还是被修改的12?*/
        System.out.println(smallPrimes[5]);//12

    }
}
