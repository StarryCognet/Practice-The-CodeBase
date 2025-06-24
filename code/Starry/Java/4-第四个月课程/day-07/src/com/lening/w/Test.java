package com.lening.w;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Ren stu = new Student();
        System.out.println("输入姓名：");
        Scanner input = new Scanner(System.in);
        stu.setName(input.next());
        stu.show();
    }
}
