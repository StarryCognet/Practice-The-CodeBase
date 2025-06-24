package com.lening.test1;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {
        //创建扫描器
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = input.next();

        //实例化对象
        Student stu = new Student();

        //给name赋值
        stu.setName(name);

        stu.show();

        System.out.println("请输入考试科目:");
        String cname = input.next();

        for (int i = 0; i < stu.scores.length; i++) {
            stu.exam(cname);
        }

        System.out.println("是否作弊:");
        stu.flag = input.next().equals("是") ? true:false;

        stu.show();

        String str = stu.isUp() == true ? "是":"否";
        System.out.println("是否升学:"+str);
    }
}
