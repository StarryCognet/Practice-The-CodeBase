package com.lening.test1;

/**
 * 图书信息实体类
 * int  - Integer
 * char - Character
 *
 * static 静态的   从属于类的    类名.属性名   类名.方法名()
 * 静态属性和静态方法
 */
public class Book {
    private Integer id;
    private String bookName;
    private String author;
    private Double price;

    static final String MALE = "男";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(Integer id, String bookName, String author, Double price) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public static void show(){
        System.out.println("show()");
    }
}

