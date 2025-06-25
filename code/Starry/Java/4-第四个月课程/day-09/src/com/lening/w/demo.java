package com.lening.w;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        //将数字10,30,2,100,20,300存入list集合中，排序
        List<Integer> numList = new ArrayList<>();
        Collections.addAll(numList, 10, 30, 2, 100, 20, 300);

        System.out.println("---------------------------");
        for (Integer i : numList) {
            System.out.println(i);
        }

        Collections.sort(numList);
        System.out.println("---------------------------");
        for (Integer i : numList) {
            System.out.println(i);
        }

        Collections.sort(numList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("---------------------------");
        for (Integer i : numList) {
            System.out.println(i);
        }
    }
}
