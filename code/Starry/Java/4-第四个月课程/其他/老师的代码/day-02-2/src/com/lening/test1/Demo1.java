package com.lening.test1;

import java.util.Scanner;

/**
 * 选择结构if   switch
 */
public class Demo1 {
    public static void main(String[] args) {
        //选择结构    分支结构
        //if     switch
        //单个if   if-else   多重if    嵌套if
        //switch
        /*
        * if和switch的区别：
        * if可以做范围和等值判断，switch只适合做等值判断
        * */

        //小明考试如果考90分以上，可以获得一个Ipad作为奖励
        //创建扫描器
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = input.nextInt();            //成绩
        if(score >= 90){
            System.out.println("获得一个Ipad作为奖励！");
        }else{
            System.out.println("不能获得奖励！");
        }


        //张三想买一辆车，如果存款有100万，买一辆奔驰；如果有50万，买一辆迈腾；如果有30万，买一辆比亚迪汉；否则，买一辆比亚迪秦L
        System.out.println("请输入存款金额(单位：万):");
        int money = input.nextInt();

        if(money >= 100){
            System.out.println("买一辆奔驰!");
        }else if(money >= 50){
            System.out.println("买一辆迈腾!");
        }else if(money >= 30){
            System.out.println("买一辆比亚迪汉!");
        }else {
            System.out.println("买一辆比亚迪秦L!");
        }

        //switch选择结构
        //李四参加奥赛，如果取得第一名,奖励清华大学夏令营活动；第二名：奖励笔记本电脑一个；第三名：奖励手机一个；否则，没有任何奖励
        System.out.println("请输入名次:");
        String mingCi = input.next();

        switch (mingCi){            //switch选择结构表达式的类型：byte int short char 枚举 String(jdk1.7以上)
            case "第一名":            //case值不能重复
                System.out.println("奖励清华大学夏令营活动!");
                break;              //break：跳出switch选择结构，解决case穿透问题
            case "第二名":
                System.out.println("奖励笔记本电脑一个!");
                break;
            case "第三名":
                System.out.println("奖励手机一个!");
                break;
            default:                //default: 相当于else        可以放在switch中的任意位置，但是执行顺序和位置没有关系，永远最后执行
                System.out.println("没有任何奖励!");
                break;
        }


        //一年有12个月，输入月份，输出季节
        System.out.println("请输入一个月份：");
        int month = input.nextInt();

        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季!");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季!");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季!");
                break;
            default:
                System.out.println("输入错误，请重新输入！");
                break;
        }
    }
}
