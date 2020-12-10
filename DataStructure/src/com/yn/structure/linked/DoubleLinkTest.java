package com.yn.structure.linked;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/10-11:44
 */
public class DoubleLinkTest {
    public static void main(String[] args) {
        DoubleLink<String> link = new DoubleLink<>();
        link.addLast("风急天高猿啸哀，");
        link.addLast("渚清沙白鸟飞回。");
        link.addLast("无边落木萧萧下，");
        link.addLast("不尽长江滚滚来。 ");
        link.addFirst("     李白");
        link.addFirst("     登高");
        link.print(link.first);
        System.out.println("***************************");
        link.set(1,"     杜甫");
        link.print(link.first);

        //link.add(0,"杜甫");
       /* link.add(4,"杜甫");
        link.print(link.first);*/
    }
}
