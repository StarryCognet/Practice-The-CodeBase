package com.ww.SuZu;

import java.util.Arrays;
import java.util.Comparator;

public class shuzu {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{20,65,82,1,23,50,44,2,33};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
