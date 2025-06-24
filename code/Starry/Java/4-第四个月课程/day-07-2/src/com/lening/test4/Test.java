package com.lening.test4;

public class Test {
    public static void main(String[] args) {
        //实例化对象
        Disk disk = new Disk();
        disk.service();

        Fan fan = new Fan();
        fan.service();

        Mouse mouse = new Mouse();
        mouse.service();
    }
}
