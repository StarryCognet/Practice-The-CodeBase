package com.lening.test1;

public class Demo5 {
    public static void main(String[] args) {
        //一个小球从100米高度自由落下，每次落地后反跳回原高度的一半；
        // 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高。
        double sum = 0;     //共经过
        double height = 100;
        for (int i = 0; i <= 9 ; i++) {
            height = height * 0.5;          //前9次弹起的高度
            sum = sum + height * 2;
        }

        height = height * 0.5;      //第十次弹起的高度
        System.out.println("它在 第10次落地时，共经过"+sum+"米");
        System.out.println("第10次反弹"+height+"米");
    }
}
