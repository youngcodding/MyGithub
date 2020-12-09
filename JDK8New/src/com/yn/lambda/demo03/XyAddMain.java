package com.yn.lambda.demo03;

import com.yn.lambda.demo02.XyAdd;
import com.yn.lambda.demo02.print;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-11:19
 */
public class XyAddMain {
    public static void main(String[] args) {
        //使用lambda表达式
        userPrint((String s)->{
            System.out.println(s);
        });
        //省略参数类型
        userPrint((s)->{
            System.out.println(s);
        });
        //如果参数只有一个还可以省略参数的括号
        userPrint(s->{
            System.out.println(s);
        });
        //如果代码块只有一句，可以省略{}和分号
        userPrint(s-> System.out.println(s));
        //使用lambda表达式
        userXyAdd((int x , int y)->{
            return x+y;
        });
        //多个参数的话，参数类型可以全部省略，但是不能只省略一个
        userXyAdd(( x,y)->{
            return x+y;
        });
        //如果代码块只有一句，可以省略{}和分号,如果有return，return也可以省略
        userXyAdd(( x,y)-> x+y);
    }

    public static void userXyAdd(XyAdd xyAdda){
        int add = xyAdda.add(10, 20);
        System.out.println(add);
    }

    public static void userPrint(print print ){
        print.printStr("天气真好 出去玩吧");
    }
}
