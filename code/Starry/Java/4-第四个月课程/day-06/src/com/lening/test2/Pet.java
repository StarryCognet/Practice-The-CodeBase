package com.lening.test2;

/**
 * 宠物类   父类
 * public 公共的
 * private 私有的
 * protected 受保护的    供本类和同包中的子类所访问
 */
public class Pet {

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

    public void show(){
        
    }
}
