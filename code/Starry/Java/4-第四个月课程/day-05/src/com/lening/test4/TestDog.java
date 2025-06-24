package com.lening.test4;

public class TestDog {
    public static void main(String[] args) {
        //实例化对象
        Dog dog1 = new Dog("欢欢",100,100,"金毛犬");
        System.out.println(dog1.toString());

        dog1.setHealth(100);
        System.out.println(dog1.toString());
    }
}
