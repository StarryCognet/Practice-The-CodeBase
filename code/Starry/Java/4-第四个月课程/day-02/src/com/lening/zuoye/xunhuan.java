package com.lening.zuoye;

import java.util.Scanner;

public class xunhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//一、使用for循环解决如下问题：
//1、输出1-100之间的所有数的和
//        int num = 0;
//        for (int i = 1; i <= 100; i++) {
//            num += i;
//        }
//        System.out.println(num);
//2、输出1-100之间的所有奇数的和
//        int num = 0;
//        for (int i = 1; i <= 100; i++) {
//            if(i % 2 != 0){
//                num += i;
//            }
//        }
//        System.out.println(num);
//3、输出1-500之间能被13或者5整除的数的和
//        int num = 0;
//        for (int i = 1; i <= 500; i++) {
//            if(i % 13 == 0 | i % 5 == 0){
//                num += i;
//            }
//        }
//        System.out.println(num);
//4、输出1-300之间能够被13和5整除的数的和
//        int num = 0;
//        for (int i = 1; i <= 300; i++) {
//            if (i % 13 == 0 & i % 5 == 0) {
//                num += i;
//            }
//        }
//        System.out.println(num);
//5、输出1-300之间能够被13整除的第5个数；
//        int num = 0;
//        for (int i = 1; i < 300; i++) {
//            if (i % 13 == 0) {
//                num++;
//                if(num == 5){
//                    System.out.println("第5个能被13整除的数是：" + i);
//                    break;
//                }
//            }
//        }


//二、输出所有的”水仙花数”，并统计”水仙花数”共有多少个。
//所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
//举例：153就是一个水仙花数。
//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
//        for (int i = 1; i <= 999; i++) {
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i / 100;
//            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
//                System.out.println(i);
//            }
//        }

//三、统计1-1000之间同时满足如下条件的数据有多少个
//对3整除余2， 对5整除余3，对7整除余2
//        for (int i = 0; i <= 1000; i++) {
//            if(i % 3 == 2 && i % 5 == 3 && i % 7 == 2){
//                System.out.println(i);
//            }
//        }

//四、输出1-500之间能够被13或者5整数的偶数，每行显示5个，然后最后求出这些偶数的和
//        int num = 0;
//        for (int i = 0; i <= 500; i++) {
//            if (i % 13 == 0 || i % 5 == 0 && i % 2 == 0) {
//                num += i;
//            }
//        }
//        System.out.println(num);

//五、计算4位数中所有的奇数的千位的和，百位的和，十位的和，个位的和。并且打印输出。
//        int num = 0;
//        for (int i = 1; i <= 9999; i++) {
//            if (i % 2 != 0){
//                int ge = i % 10;
//                int shi = i / 10 % 10;
//                int bai = i / 100;
//                System.out.println(ge + shi + bai);
//            }
//        }

//六、案例：简单计算器
//需求：输入两个整数，能够实现数学运算
//思路：
//1、在主方法中使用工具类Scanner
//使用Scanner的nextInt（）方法获得两个数
//使用Scanner的next（）方法获得运算符
//使用switch语句，根据输入的运算符选择相应的操作
//        输出结果
//        System.out.println("输入第一个数");
//        int num1 = input.nextInt();
//        System.out.println("输入第二个数");
//        int num2 = input.nextInt();
//        System.out.println("输入运算符");
//        String str = input.next();
//        int max = Math.max(num1, num2);
//        int min = Math.min(num1, num2);
//        switch (str){
//            case "+":
//                System.out.println(num1 + num2);
//                break;
//            case "-":
//                System.out.println(max - min);
//                break;
//            case "*":
//                System.out.println(num1 * num2);
//                break;
//            case "/":
//                System.out.println((double)max / min);
//            default:
//                System.out.println("请输入+、-、*、/");
//        }

//七、有一个400米一圈的操场，一个人要跑10000米， 第一圈50秒，
// 其后每一圈都比前一圈慢1秒， 按照这个规则计算跑完10000米需要多少秒
//        int oneLap = 400;
//        int full = 10000;
//        int totalSeconds = 50;
//        int num = 0;
//        for (int i = 1; i <= full / oneLap; i++) {
//            num += totalSeconds;
//            totalSeconds++;
//        }
//        System.out.println("跑完10000米需要" + num + "秒");

//八、(1)从控制台输入任意4位整数，输出该数字的各位数字之和。（15分钟）
//(2)随机生成一个4位整数，输出该数字的各位数字之和。（15分钟）
//        System.out.println("输入一个四位数");
//        int num1 = input.nextInt();
//        int ge = num1 % 10;
//        int shi = num1 / 10 % 10;
//        int bai = num1 / 100 % 10;
//        int qian = num1 / 1000;
//        System.out.println(qian);
//        System.out.println(bai);
//        System.out.println(shi);
//        System.out.println(ge);
//        int num = ge + shi + bai + qian;
//        System.out.println("该数字的各位数字之和是" + num);

//九、某酒吧搞店庆活动，两个酒瓶可以换一瓶啤酒，四个瓶盖也可以换一瓶啤酒，请问：
//小明买了十瓶啤酒，最后能喝多少瓶啤酒。
        int beerBottle = 10;//啤酒瓶
        int bottleCaps = 10;//瓶盖
        int totalNumberOfBeers = 10;//啤酒总数量
        while (true) {
            if (beerBottle >= 2) {
                beerBottle -= 2;
                beerBottle += 1;
                bottleCaps += 1;
                totalNumberOfBeers += 1;
            }
            if (bottleCaps >= 4) {
                bottleCaps -= 4;
                bottleCaps += 1;
                beerBottle += 1;
                totalNumberOfBeers += 1;
            }
            if (beerBottle < 2 && bottleCaps < 4) {
                break;
            }
        }
        System.out.println(totalNumberOfBeers);


//十、一个小球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高。
//        double overallHeight = 100;
//        double num = 100;
//        for (int i = 1; i <= 10; i++) {
//            if (i == 10) {
//                num += 100;
//                System.out.println(overallHeight / 2);
//            } else {
//                num += overallHeight;
//                overallHeight = (double) overallHeight / 2;
//            }
//        }
//        System.out.println(num);


    }
}
