package com.lening.test3;

import java.util.Date;

public class Demo2 {

    public static void main(String[] args) {
        //获取当前时间        new Date();
        Date nowDate = new Date();
        System.out.println(nowDate);

        //获取指定时间     年份  1900年开始
        Date date2 = new Date(125, 6, 24, 10, 28, 23);
        System.out.println(date2);

        Date date3 = new Date("2025/06/24 10:20:20");           // 日期之间必须用  / 分隔
        System.out.println(date3);

        //获取时间的年月日时分秒

        //年   从1900年开始
        int year = nowDate.getYear() + 1900;
        //月   0-11
        int month = nowDate.getMonth() + 1;
        int date = nowDate.getDate();

        int hours = nowDate.getHours();
        int minutes = nowDate.getMinutes();
        int seconds = nowDate.getSeconds();

        //周几    0-6    周日-0   周一到周六  1-6
        int day = nowDate.getDay();

        System.out.println(year + "年" + month + "月" + date + "日 " + hours + "时" + minutes + "分" + seconds + "秒");
    }
}
