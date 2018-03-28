package com.ahn.ioc;

public class Book {
    private String bookname;

    //使用set方法注入属性
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public void test(){
        System.out.println("bookName="+bookname);
    }
}
