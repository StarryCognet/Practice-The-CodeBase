package testList.tset2;

import testList.tset1.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, "花花", 10.0, 7);
        Cat cat2 = new Cat(2, "豆豆", 6.0, 6);
        Cat cat3 = new Cat(3, "兰兰", 7.0, 4);
        Cat cat4 = new Cat(4, "球球", 3.0, 1);
        Cat cat5 = new Cat(5, "姜姜", 12.0, 5);

        List<Cat> catList = new ArrayList<>();
        Collections.addAll(catList, cat1, cat2, cat3, cat4, cat5);
        for (Cat cat : catList) {
            System.out.println(cat);
        }

        System.out.println("遍历集合中的所有的猫，求出它们年龄的平均值，并打印输入");
        
    }
}
