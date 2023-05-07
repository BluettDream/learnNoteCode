package org.learn.demon;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.learn.demon.mapper.UserMapper;
import org.learn.demon.pojo.User;
import org.learn.demon.util.MybaisUtils;
import org.learn.demon.util.Lo4jUtils;

public class UserDaoTest {
    @Test
    public void test1(){
        Lo4jUtils lo4jUtils = new Lo4jUtils();
        lo4jUtils.initLog();
        SqlSession sqlSession = MybaisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.selectOneUser(2);
        System.out.println(user);

        sqlSession.close();
    }
}
