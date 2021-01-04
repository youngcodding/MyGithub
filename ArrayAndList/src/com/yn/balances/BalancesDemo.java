package com.yn.balances;

import java.util.Arrays;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2021/1/4-21:03
 */
public class BalancesDemo {
    public static void main(String[] args) {
        /*初始化多维数组一*/
        int[][] balances =  new int[5][5];
        //遍历多维数组
        for (int i = 0; i < balances.length; i++) {
            for (int j = 0; j <balances[i].length; j++) {
                System.out.println(balances[i][j]);
            }
        }

        /*初始化多维数组二*/
        int[][] numss ={
                {12,34,45,55,66},
                {34,45,56,23,22},
                {11,34,56,34,45},
                {23,23,34,45,36},
                {23,34,56,78,89}
        };
        //遍历多维数组
        for (int[] nums:numss){
            for (int num:nums){
                System.out.println(num);
            }
        }

        //快速输出多为数组
        System.out.println(Arrays.deepToString(numss));

    }
}
