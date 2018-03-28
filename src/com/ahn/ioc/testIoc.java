package com.ahn.ioc;

import com.ahn.bean.Bean2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testIoc {
    @Test
    public void testUser(){
        //1、加载spring配置文件，根据配置创建对象
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        //2、获取配置得到的对象
/*        User user=(User)ctx.getBean("user");
        user.add();
        System.out.println(user);
        //使用静态工厂创建对象
        Bean2 bean= (Bean2) ctx.getBean("bean2");
        System.out.println(bean);*/
/*        User user=(User)ctx.getBean("user");
        user.test();*/

/*        Book book= (Book) ctx.getBean("book");
        book.test();*/
        UserService userService= (UserService) ctx.getBean("userService");
        userService.test();
    }
}
