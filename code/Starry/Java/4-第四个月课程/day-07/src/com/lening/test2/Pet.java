package com.lening.test2;

/**
 * 宠物类   父类
 *
 * 多态的实现手段：             （在多个方法之间实现多态）1、方法重写   2、方法重载
 *                              (一个方法实现多态）1、以父类类型作为形参，传入不同的子类对象   2、以父类类型作为返回值类型，返回不同的子类对象
 */
public abstract class Pet {

    private String name;
    private Integer health;
    private Integer love;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getLove() {
        return love;
    }

    public void setLove(Integer love) {
        this.love = love;
    }

    public Pet() {
    }

    public Pet(String name, Integer health, Integer love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    //抽象方法
    public abstract void show();

    //吃东西
    public abstract void eat();
}
