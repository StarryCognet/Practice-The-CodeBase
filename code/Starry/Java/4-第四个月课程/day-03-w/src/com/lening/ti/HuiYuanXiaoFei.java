package com.lening.ti;

import java.util.Scanner;

public class HuiYuanXiaoFei {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "笔购物金额");
            arr[i] = input.nextInt();
        }
        System.out.println("序号\t\t\t\t金额（元）");
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
            System.out.println((i + 1) + "\t\t\t\t\t" + arr[i]);
        }
        System.out.println("总金额\t\t\t\t" + num);
    }
}
