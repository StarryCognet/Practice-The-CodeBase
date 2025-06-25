package com.lening.test6;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet2 {
    public static void main(String[] args) {
        //abcdefffffffffffff   有几种不同的字符
        String str = "abcdefffffffffffff";

        //拆分字符串
        String[] strs = str.split("");

        //创建set集合
        Set<String> mySet = new HashSet<String>();

        for (String s : strs) {
            //添加到set集合
            mySet.add(s);
        }

        System.out.println("集合中的元素个数:"+mySet.size());
    }
}
