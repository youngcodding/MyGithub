package com.yn.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2021/1/4-20:02
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        /*抽数字*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要多少个数：");
        int k = sc.nextInt();
        System.out.println("请输入最大的数值：");
        int n = sc.nextInt();

        //构建原始数字组
        int [] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i]=i+1;
        }

        //构建结果集
        int [] results = new int[k];
        for (int i = 0; i < k; i++) {
            int r = (int) (Math.random() * n);
            results[i]=numbers[r];
            //将已经抽取的数字重置为最大的数
            numbers[r]= numbers[n-1];
            n--;
        }

        Arrays.sort(results);
        System.out.println(Arrays.toString(results));
    }

}
