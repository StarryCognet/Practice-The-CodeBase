package com.lening.test2;

public class TestDog {
    public static void main(String[] args) {
        //实例化对象
        Dog dog = new Dog();
        dog.show();


        Dog dog1 = new Dog("欢欢",100,100,"金毛犬");
        dog1.show();
        //修改健康值为80
        dog1.health = 80;
        dog1.show();
    }
}
