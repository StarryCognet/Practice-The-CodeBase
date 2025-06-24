package com.lening.w;

import java.util.Arrays;

public class Student extends Ren {
    double[] arr = new double[4];
    boolean fl;

    @Override
    public void show() {
        System.out.println("姓名：" + super.getName() + "成绩单：" + Arrays.toString(arr) + "是否作弊：" + fl);
    }
}
