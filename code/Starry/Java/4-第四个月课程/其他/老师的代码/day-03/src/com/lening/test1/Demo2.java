package com.lening.test1;

public class Demo2 {

    public static void main(String[] args) {
        /*
        * 有一个400米一圈的操场，一个人要跑10000米， 第一圈50秒，
        * 其后每一圈都比前一圈慢1秒，
        * 按照这个规则计算跑完10000米需要多少秒
        * */
        int time = 50;      //一圈用时
        int sumTime = 0;        //总时长

        int quan = 10000 / 400;     //圈数
        for (int i = 1; i <= 25 ; i++) {
            sumTime = sumTime + time;
            time = time + 1;
        }

        System.out.println("跑完10000米需要"+sumTime+"秒");
    }
}
