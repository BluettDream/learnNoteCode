import org.junit.jupiter.api.Test;
import org.learn.collectiontype.Book;
import org.learn.collectiontype.Course;
import org.learn.collectiontype.Stu;
import org.learn.collectiontype.autowire.Emp;
import org.learn.collectiontype.bean.Orders;
import org.learn.collectiontype.factorybean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {
    @Test
    public void testT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
        System.out.println(stu);
    }

    @Test
    public void testT2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
//        book.test();
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第4步获取bean对象"+orders);
        //第5步手动配置bean销毁
        context.close();
    }

    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
