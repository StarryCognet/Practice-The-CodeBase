package com.lening.test4;

/**
 * 硬盘
 */
public class Disk implements UsbInterface{
    @Override
    public void service() {
        System.out.println("硬盘插入usb接口，传输数据!");
    }
}
