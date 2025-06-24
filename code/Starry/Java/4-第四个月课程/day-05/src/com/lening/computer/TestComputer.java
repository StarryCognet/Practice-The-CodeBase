package com.lening.computer;

public class TestComputer {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.setName("G15");
        com.setBrand("Dell");
        com.setPrice(6200);
        System.out.println(com.toString());
        com.setPrice(7000);
        System.out.println(com.toString());
    }
}
