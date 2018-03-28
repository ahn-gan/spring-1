package com.ahn.ioc;

public class UserService {
    //注入对象类型的方法与属性注入采用的set方式类似
    //1、将对象作为属性；2、生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test(){
        System.out.println("UserService");
        userDao.test();
    }
}
