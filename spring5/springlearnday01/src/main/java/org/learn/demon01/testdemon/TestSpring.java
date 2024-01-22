package org.learn.demon01.testdemon;

import org.junit.jupiter.api.Test;
import org.learn.demon01.Book;
import org.learn.demon01.Orders;
import org.learn.demon01.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemon();
    }

    @Test
    public void testOreders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
}
