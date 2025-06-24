package com.lening.test6;

/**
 * 考试实体类
 */
public class Exam {

    int score1;
    int score2;
    int score3;

    /**
     * 求总分
     */
    public int getSumScore(){
        int sumScore = score1 + score2 + score3;
        return sumScore;            //
    }

    /**
     * 求平均分
     */
    public void getAvgScore(){
        //成绩之和
        int sumScore = getSumScore();
        double avgScore = (double)sumScore / 3;
        System.out.println("平均分是:"+avgScore);
    }
}
