package com.yn.structure.recursive;

import java.math.BigInteger;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-14:36
 */
public class BigIngeterDemo {
    public static void main(String[] args) {
        System.out.println( fun(new BigInteger("100"),new BigInteger("1")));
    }
    public static BigInteger fun(BigInteger max , BigInteger min ){
        if (max.equals(min)){
            return min;
        }

        return max.multiply(fun(max.subtract(new BigInteger("1")),min));
    }
}
