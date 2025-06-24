package com.lening.test1;

public class TestBook {
    public static void main(String[] args) {
        //实例化对象
        Book book = new Book(1,"三国演义","罗贯中",56.0);
        System.out.println(book.toString());

        System.out.println(Book.MALE);
        Book.show();
    }
}
