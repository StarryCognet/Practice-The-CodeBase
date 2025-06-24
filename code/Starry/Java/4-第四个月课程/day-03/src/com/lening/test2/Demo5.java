package com.lening.test2;

public class Demo5 {
    public static void main(String[] args) {
        int[] nums = new int[]{20, 30, 18, 29, 23, 42};
        //假设数组的第一个值为最大值
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("最大值是:"+max);
    }
}
