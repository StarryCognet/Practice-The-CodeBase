package com.lening.test2;

import java.util.Arrays;

/**
 * 数组的排序
 */
public class Demo4 {
    public static void main(String[] args) {
        int[] ages = new int[]{20, 30, 18, 29, 23, 42};
        System.out.println("=========排序前===========");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        //排序            Arrays.sort(数组名);       默认是升序
        Arrays.sort(ages);

        System.out.println("=========排序后===========");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }


        //查找数字是否存在
        boolean f = false;
        for (int i = 0; i < ages.length; i++) {
            if(ages[i] == 10){
                f = true;
            }
        }

        if(f){
            System.out.println("数字10存在!");
        }else{
            System.out.println("数字10不存在!");
        }
    }
}
