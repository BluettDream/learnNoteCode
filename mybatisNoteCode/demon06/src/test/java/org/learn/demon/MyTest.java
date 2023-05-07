package org.learn.demon;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.learn.demon.mapper.StudentMapper;
import org.learn.demon.pojo.Student;
import org.learn.demon.util.MybaisUtils;

import java.util.List;

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getAllStudentInfo();
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getAllStudentInfo2();
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
