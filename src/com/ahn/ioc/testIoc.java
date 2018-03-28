package com.ahn.ioc;

import com.ahn.bean.Bean2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testIoc {
    @Test
    public void testUser(){
        //1������spring�����ļ����������ô�������
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        //2����ȡ���õõ��Ķ���
/*        User user=(User)ctx.getBean("user");
        user.add();
        System.out.println(user);
        //ʹ�þ�̬������������
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
