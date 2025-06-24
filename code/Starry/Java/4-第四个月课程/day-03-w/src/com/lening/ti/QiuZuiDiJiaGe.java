package com.lening.ti;

import java.util.Arrays;
import java.util.Scanner;

public class QiuZuiDiJiaGe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "家的价格：");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("最低的价格是："+arr[0]);
    }
}
