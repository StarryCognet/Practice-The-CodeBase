package com.lening.test2;

/**
 * 狗的信息实体类
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

    @Override
    public void eat() {
        System.out.println("狗的健康值是:"+super.getHealth());
        System.out.println("狗吃狗粮!");
        //健康值增加3
        super.setHealth(super.getHealth() + 3);
        System.out.println("狗的健康值是:"+super.getHealth());
    }
}
