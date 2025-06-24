package com.lening.w.test;

public class Student {
    public double getCji(double[] arr){
        double numHe = 0;
        for (int i = 0; i < arr.length; i++) {
            numHe += arr[i];
        }
        return numHe;
    }
    public void pjCj(double[] arr){
        double newsum = getCji(arr);
        double zzs = newsum / arr.length;
        System.out.println("平均成绩是："+ zzs);
    }

}
