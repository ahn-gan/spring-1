package com.ahn.ioc;

public class UserService {
    //ע��������͵ķ���������ע����õ�set��ʽ����
    //1����������Ϊ���ԣ�2������set����
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test(){
        System.out.println("UserService");
        userDao.test();
    }
}
