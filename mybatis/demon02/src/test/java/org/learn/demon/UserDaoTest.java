package org.learn.demon;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.learn.demon.mapper.UserMapper;
import org.learn.demon.pojo.User;
import org.learn.demon.util.MybaisUtils;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for(User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
