package com.lening.test2;

import java.util.Scanner;

/**
 * 从控制台输入某同学的5门课程的成绩，计算成绩之和和平均值
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建扫描器
        Scanner input = new Scanner(System.in);
        //创建数组
        double[] scores = new double[5];

        boolean f = true;          //标记   标记输入的数据是否完全正确
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i + 1)+"门课程的成绩:");
            scores[i] = input.nextDouble();
            if(scores[i] < 0){
                f = false;          //表示输入错误
                break;          //终止循环
            }
        }

        if(f){
            double sumScore = 0;        //成绩之和
            for (int i = 0; i < scores.length; i++) {
                sumScore += scores[i];
            }

            double avgScore = sumScore / scores.length;
            System.out.println("成绩之和:"+sumScore);
            System.out.println("平均成绩是:"+avgScore);
        }else{
            System.out.println("输入错误，请重新输入！");
        }
    }
}
