package com.lening.test2;

/**
 * for循环
 */
public class Demo4 {
    public static void main(String[] args) {
        //输出1-100之间的数字
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        //输出1-100之间的偶数
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //输出1-100之间的奇数
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        //输出1-100之间能够被3和5整除的数字,并统计有几个
        int count = 0;      //计数
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("个数是:" + count);


        //  除法          两个变量进行四则运算，结果会向类型大的一方靠拢
        int num1 = 5;
        int num2 = 2;

        double res = (double) num1 / num2;
        System.out.println(res);

        //  0<=x<1     大于等于0，小于1
        Math.random();

        //获取随机的20-30之间的数字
        for (int i = 0; i <= 100; i++) {
            int num = (int) (Math.floor(Math.random() * (30 - 20 + 1)) + 20);
            System.out.println(num);
        }


        //获取所有四位数字的个十百千位的和
        int geSum = 0;
        int shiSum = 0;
        int baiSum = 0;
        int qianSum = 0;

        for (int i = 1000; i <= 9999; i++) {
            //2345   获取个十百千位数字
            //个位     2345 % 10
            //十位     2345 / 10 % 10
            //百位     2345 / 100 % 10
            //千位     2345 / 1000
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;

            geSum += ge;
            shiSum += shi;
            baiSum += bai;
            qianSum += qian;
        }


        System.out.println("个位和:"+geSum);
        System.out.println("十位和:"+shiSum);
        System.out.println("百位和:"+baiSum);
        System.out.println("千位和:"+qianSum);
    }
}
