package com.lening.test2;

/**
 * 宠物类   父类
 *
 * 四个访问修饰符权限：
 * public 公共的
 * 默认的
 * private 私有的
 * protected 受保护的    供本类和同包中的子类所访问
 *
 * 方法重载：一同三不同：  一同：方法名相同  三不同：参数列表不同(参数个数不同、参数类型不同)    和返回值类型无关
 *          方法重载发生在一个类中的多个同名方法之间   让一个类中的同名方法根据参数的不同，实现多态
 *
 * 方法重写：三同一不同    三同： 方法名相同、参数列表相同、返回值类型相同   一不同：方法的具体实现不同
 *          重写的方法的访问修饰符不能严于父类
 *
 *          发生在具有继承关系的父子类之间，父类的方法被子类重写，
 *          同一个方法再不同的子类中有着不同的具体实现    多态
 *
 *  有一些父类没有实例化的意义，那么这样的父类就应该设置成不能被实例化的类
 *  1、抽象类不能被实例化
 *  2、抽象类的方法可以是普通方法，也可以是抽象方法，但是抽象方法一定在抽象类中
 *  3、抽象类中的抽象方法，必须被子类重写
 *  4、抽象方法没有方法体
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
}
