package com.lening.test3;

/**
 * 手机类-子类
 *
 * 不能被子类继承的情况：
 *  1、父类中被private修饰的成员不能被继承
 *  2、父类的构造方法不能被子类所继承
 */
public class Phone extends DianZi {

    private String pcard;

    public String getPcard() {
        return pcard;
    }

    public void setPcard(String pcard) {
        this.pcard = pcard;
    }


    public Phone() {
    }

    @Override
    public void print() {
        System.out.println("品牌:"+super.getName()+",型号:"+super.getType()+",价格:"+super.getPrice()+",手机卡类型:"+this.pcard);
    }

    public Phone(String name, String type, Integer price, String pcard) {
        super(name, type, price);
        this.pcard = pcard;
    }


}
