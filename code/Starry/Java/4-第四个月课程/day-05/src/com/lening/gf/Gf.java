package com.lening.gf;

public class Gf {
    private String name;
    private double hid;
    private double tiz;

    public Gf(String name, double hid, double tiz) {
        this.name = name;
        this.hid = hid;
        this.tiz = tiz;
    }

    public Gf() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHid() {
        return hid;
    }

    public void setHid(double hid) {
        this.hid = hid;
    }

    public double getTiz() {
        return tiz;
    }

    public void setTiz(double tiz) {
        this.tiz = tiz;
    }

    public void show() {
        System.out.println("我女朋友叫" + name + "身高" + hid + "厘米，体重" + tiz + "斤");
    }
}
