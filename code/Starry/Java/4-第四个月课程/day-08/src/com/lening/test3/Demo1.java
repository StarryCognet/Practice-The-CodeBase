package com.lening.test3;

public class Demo1 {

    public static void main(String[] args) {
        double random = Math.random();          //随机数取值范围：  >=0   <1
        System.out.println(random);

        double num1 = Math.ceil(10.1);          //向上取整
        System.out.println(num1);

        double num2 = Math.floor(10.9);         //向下取整
        System.out.println(num2);

        long num3 = Math.round(10.4);           //四舍五入
        System.out.println(num3);
    }
}
