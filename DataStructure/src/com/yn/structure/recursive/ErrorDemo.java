package com.yn.structure.recursive;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-14:36
 */
public class ErrorDemo {
    /*错误的demo：没有递归结束的条件*/
    private static int num = 10;
    public static void main(String[] args) {
        fun();
    }

    public static  void  fun(){
        if (num>0){
            fun();
        }
        num--;
        System.out.print(num+",");
    }
}
