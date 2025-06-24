package com.lening.test5;

/**
 * 考试实体类
 */
public class Exam {

    /**
     * 求总分
     * @param score1
     * @param score2
     * @param score3
     */
    public int getSumScore(int score1,int score2,int score3){
        int sumScore = score1 + score2 + score3;
        return sumScore;            //
    }

    /**
     * 求平均分
     * @param score1
     * @param score2
     * @param score3
     */
    public void getAvgScore(int score1,int score2,int score3){
        //成绩之和
        int sumScore = getSumScore(score1, score2, score3);
        double avgScore = (double)sumScore / 3;
        System.out.println("平均分是:"+avgScore);
    }
}
