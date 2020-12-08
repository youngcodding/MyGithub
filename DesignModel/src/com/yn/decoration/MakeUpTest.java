package com.yn.decoration;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-8:47
 */
public class MakeUpTest {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
       new Lipstick(new EyeBrow(new EyeLine(girlFriend))).make();
    }
}
