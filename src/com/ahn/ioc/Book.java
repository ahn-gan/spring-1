package com.ahn.ioc;

public class Book {
    private String bookname;

    //ʹ��set����ע������
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public void test(){
        System.out.println("bookName="+bookname);
    }
}
