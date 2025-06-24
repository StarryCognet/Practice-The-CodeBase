package com.lening.test2;

/**
 * 企鹅信息实体类
 */
public class Penguin extends Pet{

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Penguin() {
    }

    public Penguin(String name, Integer health, Integer love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    @Override
    public void show(){
        System.out.println("昵称:"+super.getName()+",健康值:"+super.getHealth()+",亲密度:"+super.getLove()+",性别:"+sex);
    }
}
