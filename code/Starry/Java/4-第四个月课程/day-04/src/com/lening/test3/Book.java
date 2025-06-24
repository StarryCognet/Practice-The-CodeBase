package com.lening.test3;

/**
 * 图书信息实体类
 */
public class Book {

    String bookName;        //图书名称
    String author;          //作者
    double price;           //价格

    /**
     * 展示图书信息
     */
    public void show() {
        System.out.println("图书名称:" + this.bookName + ",作者:" + this.author + ",价格:" + this.price);
    }

    /**
     * 计算图书折扣之后的价格
     */
    public void calcPrice(){
        if(this.price > 100){
            this.price = this.price * 0.6;
        }else if(this.price > 80){
            this.price = this.price * 0.8;
        }else{
            this.price = this.price * 0.9;
        }
        System.out.println("折扣之后的价格是:"+this.price);
    }
}
