package com.ahn.ioc;

public class User {
    //����ע�뷽ʽ
    /*1���вι��캯��
    * 2��ʹ��set����*/
    private String username;

    public User(String username) {
        this.username=username;
    }

    public  void add(){
        System.out.println("add>>>>>>>");
    }
    public void test(){
        System.out.println("username="+username);
    }

    public static void main(String[] args){

    }
}
