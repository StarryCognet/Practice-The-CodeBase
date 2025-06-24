package com.lening.test3;

/**
 * 锁 接口
 * 1、接口不能被实例化
 * 2、接口中的所有方法都是抽象方法，那么public abstract是可以省略的
 * 3、接口中的所有变量都是静态常量,那么final static 是可以省略的
 * 4、实现类必须实现接口的所有抽象方法
 * 5、一个类可以实现多个接口,一个接口也可以被多个类所实现
 */
public interface Lock {
    String name = "张三";
    //开锁
    void openLock();

    //上锁
    void closeLock();
}
