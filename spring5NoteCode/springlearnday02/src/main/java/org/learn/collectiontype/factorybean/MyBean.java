package org.learn.collectiontype.factorybean;

import org.learn.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

public class MyBean implements FactoryBean<Course>{
    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }
    @Override
    public Class<?> getObjectType() {
        return null;
    }
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
