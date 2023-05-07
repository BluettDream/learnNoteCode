package org.learn.demon.mapper;

import org.apache.ibatis.annotations.Param;
import org.learn.demon.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> selectAllTeacher();

    Teacher getTeacherById(@Param("tid") int id);
}