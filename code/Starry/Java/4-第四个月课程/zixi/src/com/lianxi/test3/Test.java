package com.lianxi.test3;

public class Test {
    public static void main(String[] args) {
        DianZi com = new Computer("dell", "5520", 5600, "456");
        DianZi ph = new Phone("dell", "5520", 5600, "456");

        System.out.println(com.toString());
        System.out.println(ph.toString());
    }
}
