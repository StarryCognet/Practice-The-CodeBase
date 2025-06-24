package com.lening.test1;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {            //Integer
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{10, 20, 2, 100, 233, 212};

        System.out.println("==========循环遍历数组===========");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //排序    升序
        Arrays.sort(nums);

        System.out.println("==========循环遍历数组===========");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println("==========循环遍历数组===========");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
