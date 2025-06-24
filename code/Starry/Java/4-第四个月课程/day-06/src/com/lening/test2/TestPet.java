package com.lening.test2;

public class TestPet {

    public static void main(String[] args) {
        //子类new子类
        Dog dog = new Dog("贝贝",100,100,"拉布拉多犬");
        dog.show();
        dog.getStrain();

        //父类new子类
        Pet dog2 = new Dog("贝贝",100,100,"拉布拉多犬");
        dog2.show();

        Pet p1 = new Penguin("晶晶",100,100,"雌性");
        p1.show();


    }
}
