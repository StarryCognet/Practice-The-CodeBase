package com.lening.test1;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        //创建扫描器
        Scanner input = new Scanner(System.in);
        //实例化对象
        Student stu = new Student();
        //创建成绩数组
        double[] scores = new double[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "门课程的成绩:");
            scores[i] = input.nextDouble();
        }


        //求和
        double sumScore = stu.getSumScore(scores);
        System.out.println("成绩之和是:"+sumScore);

        //求平均分
        stu.getAvgScore(scores);
    }
}
