package org.learn.demon.mapper;

import org.apache.ibatis.annotations.Param;
import org.learn.demon.pojo.MyBlog;

import java.util.List;
import java.util.Map;

/**
* @Entity org.learn.demon.org.learn.demon.pojo.Myblog
*/
public interface MyBlogMapper {

    int insertBlogByAll(MyBlog myBlog);

    List<MyBlog> selectBlogJudge(Map map);

    int updateBlogById(Map map);

    List<MyBlog> selectBlogById(Map map);
}
