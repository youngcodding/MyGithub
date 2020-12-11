package com.yn.structure.arrayList;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/10-21:51
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.print();
        list.add(1,"m");
        list.print();
    }
}
