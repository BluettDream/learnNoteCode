package org.learn.demon.service;

import org.learn.demon.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//在注解里面value属性值可以省略不写，
//默认值是类名称，首字母小写
@Service
public class UserService {

    @Value(value = "abc")
    private String name;

    public void add(){
        System.out.println("service add....."+name);
    }
}
