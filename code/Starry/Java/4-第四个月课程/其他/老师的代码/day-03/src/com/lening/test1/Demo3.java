package com.lening.test1;

public class Demo3 {
    public static void main(String[] args) {
        //(2)随机生成一个4位整数，输出该数字的各位数字之和。（15分钟）
        int random = (int) (Math.floor(Math.random()*(9999-1000 + 1)) + 1000);
    }
}
