import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.learn.demon.mapper.MyBlogMapper;
import org.learn.demon.pojo.MyBlog;
import org.learn.demon.utils.IdUtils;
import org.learn.demon.utils.MybaisUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author blue
 * @date 2021/7/22
 */
public class MyTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();
        MyBlogMapper mapper = sqlSession.getMapper(MyBlogMapper.class);

        MyBlog blog = new MyBlog();

        blog.setId(IdUtils.getId());
        blog.setTitle("mybatis");
        blog.setAuthor("blue");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.insertBlogByAll(blog);
        sqlSession.commit();

        blog.setId(IdUtils.getId());
        blog.setTitle("spring");
        blog.setAuthor("blue");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.insertBlogByAll(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();
        MyBlogMapper mapper = sqlSession.getMapper(MyBlogMapper.class);

        HashMap map = new HashMap();
        map.put("title","java");
        map.put("author","blue");
        List<MyBlog> myBlogs = mapper.selectBlogJudge(map);
        for (MyBlog myBlog : myBlogs) {
            System.out.println(myBlog);
        }

        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();
        MyBlogMapper mapper = sqlSession.getMapper(MyBlogMapper.class);

        HashMap map = new HashMap();
        map.put("author","田");
        map.put("id","b7feaf375d4341fc94d34e971725ef2c");
        mapper.updateBlogById(map);

        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession = MybaisUtils.getSqlSession();
        MyBlogMapper mapper = sqlSession.getMapper(MyBlogMapper.class);

        HashMap map = new HashMap();
        ArrayList<String> list = new ArrayList<>();
        list.add("blue");
        list.add("田");
        map.put("names",list);
        List<MyBlog> myBlogList = mapper.selectBlogById(map);
        for (MyBlog myBlog : myBlogList) {
            System.out.println(myBlog);
        }

        sqlSession.close();
    }
}
