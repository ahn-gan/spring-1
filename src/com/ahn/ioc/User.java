package com.ahn.ioc;

public class User {
    //属性注入方式
    /*1、有参构造函数
    * 2、使用set方法*/
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
