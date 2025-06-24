package com.lening.test4;

/**
 * 电扇
 */
public class Fan implements UsbInterface{
    @Override
    public void service() {
        System.out.println("电扇插入usb接口，电扇转动!");
    }
}
