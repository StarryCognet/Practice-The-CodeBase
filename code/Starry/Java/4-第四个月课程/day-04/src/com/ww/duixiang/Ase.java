package com.ww.duixiang;

public class Ase {
    String name;
    String age;
    double num;

    public void minn() {
        System.out.println("名字是：" + this.name + "\n岁数是：" + age + "\n编号：" + num);
    }

    public static void main(String[] args) {
        Ase ase = new Ase();
        ase.name = "张三";
        ase.age = "18";
        ase.num = 20.5;
        ase.num = 40;
        ase.minn();
    }
}
