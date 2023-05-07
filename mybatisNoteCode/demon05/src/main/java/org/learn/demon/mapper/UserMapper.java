package org.learn.demon.mapper;

import org.learn.demon.pojo.User;

public interface UserMapper {

    //查询指定用户
    User selectOneUser(int id);

}
