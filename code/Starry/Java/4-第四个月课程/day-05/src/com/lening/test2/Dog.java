package com.lening.test2;

/**
 * 面向对象编程的三大特征： 封装、继承、多态
 * 构造方法的作用:   1、创建对象    2、给对象的属性赋值
 * 如果类中没有任何的构造方法，那么系统会默认提供一个 无参的构造方法，但是如果类中有一个构造方法，那么系统就不会再默认提供无参构造方法
 *
 * public 类名(){
 *
 * }
 *
 * 方法重载： 一同三不同   一同：方法名相同    三不同： 参数列表不同(参数个数不同、参数类型不同)     和返回值类型无关
 *
 */
public class Dog {
    String name;            //昵称
    int health;             //健康值
    int love;               //亲密度
    String strain;          //品种

    /**
     * 展示狗的信息
     */
    public void show() {
        System.out.println("昵称:" + this.name + ",健康值:" + this.health + ",亲密度:" + this.love + ",品种:" + this.strain);
    }

    public Dog() {
    }

    public Dog(String name, int health, int love, String strain) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.strain = strain;
    }

}
