package com.demo.domain;

import java.io.Serializable;

public class Student implements Serializable{
    private String sname;
    private String sno;
    private String sex;
    private String department;
    private int age;

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getDepartment() {
        return department;
    }

    public String getSname() {
        return sname;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
