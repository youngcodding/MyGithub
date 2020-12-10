package com.yn.structure.linked;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-20:03
 */
public class LinkTest {
    public static void main(String[] args) {
        Link<String> link = new Link<>();
        link.add("Java核心卷一");
        link.add("Java核心卷二");
        link.add("计算机组成原理");
        link.add("数据库从删库到跑路");
        link.add("VUE实战训练");
        link.print();
        System.out.println("链表长度："+link.size());
        link.remove("Java核心卷一");
        System.out.println("----------------------");
        link.print();
        System.out.println("链表长度："+link.size());
    }
}
