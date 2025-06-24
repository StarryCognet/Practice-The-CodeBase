package com.lening.test3;

public class TestFangDoor {

    public static void main(String[] args) {

        //实例化防盗门对象
        FangDoor fangDoor = new FangDoor();
        fangDoor.touch();
        fangDoor.openLock();
        fangDoor.openDoor();
        fangDoor.closeDoor();
        fangDoor.closeLock();

        Door fang1= new FangDoor();
        fang1.closeDoor();
        fang1.openDoor();

        Lock fang2 = new FangDoor();
        fang2.openLock();
        fang2.closeLock();
    }
}
