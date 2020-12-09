package com.yn.lambda.demo02;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-11:09
 */
public class DrinkWaterMain {
    public static void main(String[] args) {
        //使用匿名内部类实现
        userDrink(new DrinkWater() {
            @Override
            public void drink() {
                System.out.println("多喝热水对身体好！");
            }
        });

        //使用lambda表达式
        userDrink(()->{
            System.out.println("多喝热水对身体好！");
        });
    }

    public static void userDrink(DrinkWater drinkWater){
        drinkWater.drink();
    }
}
