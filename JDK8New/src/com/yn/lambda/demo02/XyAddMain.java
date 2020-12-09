package com.yn.lambda.demo02;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-11:19
 */
public class XyAddMain {
    public static void main(String[] args) {
        //使用匿名内部类的方式
        userXyAdd(new XyAdd() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        });

        //使用lambda表达式
        userXyAdd((int x , int y)->{
            return x+y;
        });
    }

    public static void userXyAdd(XyAdd xyAdda){
        int add = xyAdda.add(10, 20);
        System.out.println(add);
    }
}
