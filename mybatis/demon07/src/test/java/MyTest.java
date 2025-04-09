import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.learn.demon.mapper.TeacherMapper;
import org.learn.demon.pojo.Teacher;
import org.learn.demon.util.MybaisUtils;

import java.util.List;

/**
 * @author blue
 * @date 2021/7/22
 */
public class MyTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> teacherList = mapper.selectAllTeacher();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacherById(1);
        System.out.println(teacher);

        sqlSession.close();
    }
}
