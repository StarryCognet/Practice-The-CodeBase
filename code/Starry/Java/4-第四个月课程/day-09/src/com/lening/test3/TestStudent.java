package com.lening.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        //实例化5个学生对象
        Student stu1 = new Student(1, "张三", 18, "男");
        Student stu2 = new Student(2, "李四", 22, "男");
        Student stu3 = new Student(3, "王五", 24, "女");
        Student stu4 = new Student(4, "赵六", 30, "女");
        Student stu5 = new Student(5, "田七", 40, "男");


        //创建list集合
        List<Student> stuList = new ArrayList<Student>();

        //添加元素
        Collections.addAll(stuList, stu1, stu2, stu3, stu4, stu5);

        //1.循环遍历集合中的学生信息
        System.out.println("==========循环遍历学生信息==========");
        for (Student student : stuList) {
            System.out.println(student.toString());
        }

        //按照年龄降序排列
        Collections.sort(stuList);

        System.out.println("==========循环遍历学生信息==========");
        for (Student student : stuList) {
            System.out.println(student.toString());
        }


    }
}
