package com.lening.test5;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
//        List<String> myList = new LinkedList<String>();
//        myList.add("张三");
//        myList.add("李四");
//        myList.add("王五");
//
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
//        myList.remove(2);

        LinkedList<String> myList = new LinkedList<String>();
        myList.add("张三");
        myList.add("李四");
        myList.add("王五");

        myList.addFirst("赵六");
        //myList.add(0,"赵六");
        myList.addLast("田七");


        String name1 = myList.getFirst();
        String name2 = myList.getLast();

        myList.removeFirst();
        myList.removeLast();

    }
}
