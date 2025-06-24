package com.lening.shoji;

public class TestSj {
    public static void main(String[] args) {
        Sj sj = new Sj();
        sj.setBrand("小米");
        sj.setPrice(2500);
        sj.setColor("蓝色");
        sj.call();
        sj.sendMessage();
    }
}
