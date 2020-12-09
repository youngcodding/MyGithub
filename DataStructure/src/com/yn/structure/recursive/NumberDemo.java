package com.yn.structure.recursive;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-14:43
 */
public class NumberDemo {
    public static void main(String[] args) {
        System.out.println( fun(100,1));
    }
    public static int fun(int max , int min ){
        if (max==min){
            return min;
        }

        return max*fun(max-1,min);
    }
}
