package com.yn.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2021/1/4-20:55
 */
public class ArraysDemo02 {
    public static void main(String[] args) {
        testfill02();
    }

    /**
     * 修改数组中的所有值
     */
    public static  void testfill01(){
        int a[] = {0,0,0,0,0,0,0};
        Arrays.fill(a,1);
        //[1, 1, 1, 1, 1, 1, 1]
        System.out.println(Arrays.toString(a));
    }

    /**
     * 修改数组中的指定区间的值
     * fill(type[] types , int start, int end , type t)
     * 修改索引从start到end的数值 包含start不包含end
     */
    public static  void testfill02(){
        int a[] = {0,0,0,0,0,0,0};
        Arrays.fill(a,1,3,4);
        //[0, 4, 4, 0, 0, 0, 0]
        System.out.println(Arrays.toString(a));
    }
}
