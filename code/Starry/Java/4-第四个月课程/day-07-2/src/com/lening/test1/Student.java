package com.lening.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Student extends Person {

    //创建扫描器
    Scanner input = new Scanner(System.in);
    double[] scores = new double[4];
    boolean flag;
    int count = 0;      //表示第几次考试

    @Override
    public void show() {
        System.out.println("姓名:" + super.getName() + ",成绩单:" + Arrays.toString(scores) + ",是否作弊:" + flag);
    }

    @Override
    public void exam(String cname) {
        System.out.println("请输入" + cname + "的成绩:");
        scores[count] = input.nextDouble();

        if (count < 4) {
            count++;        //考试次数+1
        }

        System.out.println(count+"次考试的总分是:"+sum()+",平均分是:"+avg());
    }

    /**
     * 总成绩
     *
     * @return
     */
    public double sum() {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    /**
     * 平均成绩
     * @return
     */
    public double avg() {
        return sum() / count;
    }

    /**
     * 是否升学
     * @return
     */
    public boolean isUp(){
        boolean f = false;
        if(flag){
            //最后一次考试90分即可升学
            if(scores[3] >= 90){
                f = true;
            }
        }else{
            //没有作弊
            double avg = avg();
            //3次考试的平均分
            double avg2 = (avg() * 4 - scores[3] ) / 3;

            if(avg >= 85 || (avg2 >= 85 && scores[3] >= 70)){
                f = true;
            }
        }
        return f;
    }
}
