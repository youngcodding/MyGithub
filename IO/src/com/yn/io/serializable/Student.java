package com.yn.io.serializable;

import java.io.Serializable;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/1-19:54
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -4218770093294855073L;

    private String snumber;//学号
    private String sname;//姓名
    private char sex;//性别
    private int age;//年龄
    //transient修饰这个属性 不可以被序列化
    private transient String address;//通讯地址

    public Student(String snumber, String sname, char sex, int age, String address) {
        this.snumber = snumber;
        this.sname = sname;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "snumber='" + snumber + '\'' +
                ", sname='" + sname + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
