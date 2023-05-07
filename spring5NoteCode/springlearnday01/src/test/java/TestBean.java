import org.junit.jupiter.api.Test;
import org.learn.demon01.bean.Emp;
import org.learn.demon01.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testadd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
