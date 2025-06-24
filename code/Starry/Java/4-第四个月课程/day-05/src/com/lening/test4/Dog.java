package com.lening.test4;

/**
 * 面向对象编程的三大特征： 封装、继承、多态
 * 封装的步骤：1、私有化属性    2、提供公共的getter和setter方法
 *
 * 封装的特点：保留内部细节，提供对外接口
 *
 * 一个实体类中的四个部分：
 * 1、私有化属性                      不允许外部的类随意访问
 * 2、公共的getter和setter方法         使用set方法赋值   使用get取值
 * 3、构造方法                       创建对象的同时完成对属性的赋值
 * 4、toString();                    测试数据
 */
public class Dog {
    //私有的
    private String name;            //昵称
    private int health;             //健康值
    private int love;               //亲密度
    private String strain;          //品种


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }


    public Dog() {
    }

    public Dog(String name, int health, int love, String strain) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.strain = strain;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                ", strain='" + strain + '\'' +
                '}';
    }
}
