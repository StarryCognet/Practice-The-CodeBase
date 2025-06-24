package com.lening.test3;

/**
 * 电脑类-子类
 */
public class Computer extends DianZi{

    private Integer cpu;

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Computer() {
    }

    @Override
    public void print() {
        System.out.println("品牌:"+super.getName()+",型号:"+super.getType()+",价格:"+super.getPrice()+",Cpu:"+this.cpu);
    }

    public Computer(String name, String type, Integer price, Integer cpu) {
        super(name, type, price);       //调用父类的构造方法   super();
        this.cpu = cpu;
    }

}
