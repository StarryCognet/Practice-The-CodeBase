package com.lening.test3;

public class TestBook {
    public static void main(String[] args) {
        //实例化图书对象
        Book book1 = new Book();

        //给属性 赋值
        book1.bookName = "三国演义";
        book1.author = "罗贯中";
        book1.price = 90;

        //调用方法
        book1.show();

        book1.calcPrice();

        //实例化图书对象
        Book book2 = new Book();

        //给属性 赋值
        book2.bookName = "西游记";
        book2.author = "吴承恩";
        book2.price = 110;

        //调用方法
        book2.show();

        book2.calcPrice();
    }
}
