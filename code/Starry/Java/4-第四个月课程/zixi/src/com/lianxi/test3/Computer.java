package com.lianxi.test3;

public class Computer extends DianZi{
    private String cpu;

    public Computer(String name, String type, Integer price) {
        super(name, type, price);
    }

    public Computer(String cpu) {
        this.cpu = cpu;
    }

    public Computer(String name, String type, Integer price, String cpu) {
        super(name, type, price);
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                "} " + super.toString();
    }
}
