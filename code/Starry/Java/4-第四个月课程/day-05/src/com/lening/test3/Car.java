package com.lening.test3;

/**
 * 小汽车类
 */
public class Car {

    public void run() {
        System.out.println("小汽车正在行驶!");
    }


    public void run(String name) {
        System.out.println(name + "正在驾驶小汽车行驶！");
    }

    public void run(String name, int speed) {
        System.out.println(name + "正在驾驶小汽车一" + speed + "km/h的速度行驶！");
    }
}
