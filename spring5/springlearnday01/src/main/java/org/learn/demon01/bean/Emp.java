package org.learn.demon01.bean;

public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }

    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
