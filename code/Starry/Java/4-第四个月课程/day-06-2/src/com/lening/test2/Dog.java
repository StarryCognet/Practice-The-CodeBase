package com.lening.test2;

/**
 * 狗的信息实体类
 * 继承：  传递性    单根性
 *
 * 代码冗余   代码重复
 * extends 继承
 */
public class Dog extends Pet{

    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Dog() {
    }

    public Dog(String name, Integer health, Integer love, String strain) {
        super(name, health, love);          //super-this   this:当前对象  super:父类对象
        this.strain = strain;
    }

    @Override
    public void show() {
        System.out.println("昵称:"+super.getName()+",健康值:"+super.getHealth()+",亲密度:"+super.getLove()+",品种:"+strain);
    }
}
