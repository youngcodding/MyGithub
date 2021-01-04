package com.yn.Arrays;

import java.util.Arrays;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/14-22:07
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] smallPrimes = {2,3,5,7,11,13};
        /*
        * 复制数组
        * 参数一：被复制的数组
        * 参数二: 复制的长度*/
        int[] ints = Arrays.copyOf(smallPrimes, smallPrimes.length);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
