package com.lening.ti;

import java.util.Arrays;
import java.util.Scanner;

public class zy {
    public static void main(String[] args) {

        //6、有如下的一个数组： int[] nums = new int[]{100,80,200,40,24};完成如下功能:
        //(1)循环输出数组中的每一个元素
        //(2)对数组中的数据进行排序，然后输出排序之后的结果
        //(3)手动输入一个数字，查看数组中是否含有这个数，如果存在，
        // 则输出该数字存在，如果不在，输出该数字不存在。

        int[] nums = new int[]{100, 80, 200, 40, 24};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(",");
        }
        System.out.println();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(",");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("輸入一个数判断数组里有没有");
        int num = input.nextInt();
        boolean f = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num){
                f = false;
                System.out.println("有");
            }
        }
        if (f){
            System.out.println("没有");
        }
    }
}
