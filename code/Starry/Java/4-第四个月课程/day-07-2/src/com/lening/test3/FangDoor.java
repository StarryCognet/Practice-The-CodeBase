package com.lening.test3;

/**
 * 防盗门
 * java的继承是单一性的：一个类只能继承一个父类，但是却可以实现多个接口
 * implements 实现接口
 *
 * 接口表示一种能力，这种能力体现在接口的方法上面。
 * 接口表示一种约束，这种约束体现在方法的名字和方法的注释上面
 *
 * 防盗门是一个门              is a      继承
 * 防盗门上面有一把锁          has a     实现接口
 */
public class FangDoor extends Door implements Lock,Dell{
    @Override
    public void openDoor() {
        System.out.println("轻轻一推，门开了!");
    }

    @Override
    public void closeDoor() {
        System.out.println("使劲一拉，门关上了!");
    }

    @Override
    public void openLock() {
        System.out.println("钥匙顺时针旋转3圈，锁开了!");
    }

    @Override
    public void closeLock() {
        System.out.println("钥匙逆时针旋转3圈，锁上了!");
    }

    @Override
    public void touch() {
        System.out.println("铃铃铃。。。");
    }
}
