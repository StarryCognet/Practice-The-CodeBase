package com.lening.test1;

/**
 * 学生类
 */
public class Student {

    /**
     * 求成绩之和
     * @return 成绩之和
     */
    public double getSumScore(double[] scores){
        double sumScore = 0;
        for (int i = 0; i < scores.length; i++) {
            sumScore = sumScore + scores[i];
        }
        return sumScore;
    }

    /**
     * 求平均成绩
     */
    public void getAvgScore(double[] scores){
        //求和
        double sumScore = getSumScore(scores);
        //平局分
        double avgScore = sumScore / scores.length;
        System.out.println("平均成绩是:"+avgScore);
    }
}
