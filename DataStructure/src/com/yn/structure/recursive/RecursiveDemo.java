package com.yn.structure.recursive;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-14:31
 */
public class RecursiveDemo {
    /*简单的递归demo*/
    private static int num = 10;
    public static void main(String[] args) {
        fun();
    }

    public static  void  fun(){
        num--;
        System.out.print(num+",");
        if (num>0){
            fun();
        }
    }
}
