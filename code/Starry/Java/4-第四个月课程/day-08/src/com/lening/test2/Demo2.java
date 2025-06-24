package com.lening.test2;

public class Demo2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("姓名:");
        //追加
        sb.append("张三");
        sb.append(",年龄:");
        sb.append(20);


        //转换成string类型
        System.out.println(sb.toString());
    }
}
