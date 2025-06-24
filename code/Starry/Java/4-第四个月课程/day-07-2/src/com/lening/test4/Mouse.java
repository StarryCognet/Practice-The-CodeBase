package com.lening.test4;

/**
 * 鼠标
 */
public class Mouse implements UsbInterface{
    @Override
    public void service() {
        System.out.println("鼠标插入usb接口，操作电脑!");
    }
}
