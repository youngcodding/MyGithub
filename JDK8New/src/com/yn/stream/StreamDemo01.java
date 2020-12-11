package com.yn.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/11-22:01
 */
public class StreamDemo01 {
    /*
    需求：按照下面的要求完成集合的创建和遍历
        1:创建一个集合，存储多个字符串元素
        2:把集合中所有以"张"开头的元素存储到一个新的集合
        3:把"张"开头的集合中的长度为3的元素存储到一个新的集合
        4:遍历上一步得到的集合
 */
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        List<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        //把集合中所有以"张"开头的元素存储到一个新的集合
        List<String> zhangList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                zhangList.add(s);
            }
        }
        //把"张"开头的集合中的长度为3的元素存储到一个新的集合
        List<String> threeList = new ArrayList<>();
        for (String s : zhangList) {
            if (s.length()==3){
                threeList.add(s);
            }
        }
        //遍历上一步得到的集合
        for (String s : threeList) {
            System.out.println(s);
        }

        System.out.println("**************************");
    //以上的方式过于麻烦 现在使用stream流来简化
        //list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);

    }


}
