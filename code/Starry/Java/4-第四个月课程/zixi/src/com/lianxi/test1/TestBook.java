package com.lianxi.test1;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book(1, "三国演义","罗贯中",50.0);
        System.out.println(book.toString());
        System.out.println(Book.na);
    }
}
