package com.lianxi.test2;

public class Pet {
    private String name;
    private Integer hp;
    private Integer love;

    public Pet() {
    }

    public Pet(String name, Integer hp, Integer love) {
        this.name = name;
        this.hp = hp;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getLove() {
        return love;
    }

    public void setLove(Integer love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", love=" + love +
                '}';
    }
}
