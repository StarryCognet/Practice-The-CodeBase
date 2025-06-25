package com.lening.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //将数字10,30,2,100,20,300存入list集合中，排序
        List<Integer> numList = new ArrayList<Integer>();
        Collections.addAll(numList,10,30,2,100,20,300);


        System.out.println("+++++++++++++遍历集合++++++++++++");
        for (Integer num : numList) {
            System.out.println(num);
        }

        //排序器   1.内置排序器    2.外置排序器
        Collections.sort(numList);
        System.out.println("+++++++++++++遍历集合++++++++++++");
        for (Integer num : numList) {
            System.out.println(num);
        }

        //外置排序器
        Collections.sort(numList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });


        System.out.println("+++++++++++++遍历集合++++++++++++");
        for (Integer num : numList) {
            System.out.println(num);
        }
    }
}
