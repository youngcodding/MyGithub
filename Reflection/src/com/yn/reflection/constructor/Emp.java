package com.yn.reflection.constructor;

import com.yn.reflection.annotation.EmpAnnotation;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-16:17
 */
@SuppressWarnings("serial")
public class Emp implements Serializable ,Cloneable {
    private Integer eno;
    private String ename;
    private String job;
    private String sal;
    private Integer mgr;
    private Integer deptno;
    private Date hireDate;


    public   Emp(){}
    public Emp(Integer eno) {
        this.eno = eno;
    }

    public Emp(Integer eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    public Emp(Integer eno, String ename, String job) {
        this.eno = eno;
        this.ename = ename;
        this.job = job;
    }

    public Emp(Integer eno, String ename, String job, String sal) {
        this.eno = eno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
    }

    public Emp(Integer eno, String ename, String job, String sal, Integer mgr) {
        this.eno = eno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.mgr = mgr;
    }

    public Emp(Integer eno, String ename, String job, String sal, Integer mgr, Integer deptno) {
        this.eno = eno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.mgr = mgr;
        this.deptno = deptno;
    }

    private Emp(Integer eno, String ename, String job, String sal, Integer mgr, Integer deptno, Date hireDate) {
        this.eno = eno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.mgr = mgr;
        this.deptno = deptno;
        this.hireDate = hireDate;
    }


    @EmpAnnotation
    public void set(Integer eno,String job,Date hireDate){
        this.eno = eno;
        this.job = job;
        this.hireDate = hireDate;
    }
    private Integer getEno() {
        return eno;
    }

    private void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", sal='" + sal + '\'' +
                ", mgr=" + mgr +
                ", deptno=" + deptno +
                ", hireDate=" + hireDate +
                '}';
    }
}
