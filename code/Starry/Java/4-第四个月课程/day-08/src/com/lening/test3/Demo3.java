package com.lening.test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) {


        //格式化日期工具类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String dateStr = "2025-06-28 14:20:20";
        //字符串类型的日期转 日期类型的变量
        try {
            Date date = sdf.parse(dateStr);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //日期类型的变量转字符串
        Date nowDate = new Date("2025/06/28 14:20:20");          //2025-06-24 12:20:20
        String str = sdf.format(nowDate);
        System.out.println(str);
    }
}
