package com.yn.structure.recursive;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-14:36
 */
public class CommonDemo {
    /*观察递归的调用*/
    private static int num = 10;
    public static void main(String[] args) {
        fun();
    }

    public static  void  fun(){
        num--;
        if (num>0){
            fun();
        }
        System.out.print(num+",");
    }
}
