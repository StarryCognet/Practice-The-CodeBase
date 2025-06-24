package com.lening.test3;

public class TestDianZi {

    public static void main(String[] args) {

        //子类new子类
        Phone p1 = new Phone("华为","Mate70",5999,"移动、电信、联通");
        p1.print();

        //父类new子类
        DianZi p2 = new Phone("华为","Mate80",6999,"移动、电信、联通");
        p2.print();
    }
}
