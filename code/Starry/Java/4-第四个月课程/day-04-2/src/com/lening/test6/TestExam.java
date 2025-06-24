package com.lening.test6;

import java.util.Scanner;

public class TestExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //实例化对象
        Exam exam1 = new Exam();


        System.out.println("请输入第一门课程的成绩:");
        exam1.score1 = input.nextInt();
        System.out.println("请输入第二门课程的成绩:");
        exam1.score2= input.nextInt();
        System.out.println("请输入第三门课程的成绩:");
        exam1.score3 = input.nextInt();

        int sumScore = exam1.getSumScore();
        System.out.println("总成绩是:"+sumScore);

        exam1.getAvgScore();
    }
}
