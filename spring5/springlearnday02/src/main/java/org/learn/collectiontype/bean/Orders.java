package org.learn.collectiontype.bean;

public class Orders {
    private String oname;
    public Orders() {
        System.out.println("第1步构造器创建bean实例");
    }
    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第2步调用set方法");
    }
    public void initMethod(){
        System.out.println("第3步调用bean初始化方法");
    }
    public void destoryMethod(){
        System.out.println("第5步调用bean销毁方法");
    }
}
