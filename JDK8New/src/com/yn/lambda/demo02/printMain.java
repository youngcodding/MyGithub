package com.yn.lambda.demo02;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-11:14
 */
public class printMain {
    public static void main(String[] args) {
        //使用匿名内部类
        userPrint(new print() {
            @Override
            public void printStr(String s) {
                System.out.println(s);
            }
        });

        //使用lambda表达式
        userPrint((String s)->{
            System.out.println(s);
        });
    }

    public static void userPrint(print print ){
        print.printStr("天气真好 出去玩吧");
    }
}
