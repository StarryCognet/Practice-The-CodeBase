package com.lening.w.test;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        double[] arr = new double[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("课程" + (i + 1) + "的成绩");
            arr[i] = input.nextDouble();
        }
        stu.pjCj(arr);
    }
}
