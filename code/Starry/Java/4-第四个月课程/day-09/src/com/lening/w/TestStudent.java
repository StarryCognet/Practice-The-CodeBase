package com.lening.w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "张三", 18, "男");
        Student stu2 = new Student(2, "李四", 20, "女");
        Student stu3 = new Student(3, "王五", 15, "女");
        Student stu4 = new Student(4, "赵六", 40, "男");
        Student stu5 = new Student(5, "刘七", 32, "男");

        List<Student> stuList = new ArrayList<>();//创建数组ArrayList
        Collections.addAll(stuList, stu1, stu2, stu3, stu4, stu5);//添加内容

        for (Student student : stuList) {//循环数组
            System.out.println(student.getAge());
        }

        //2.查找张三是否存在，如果存在则删除该学生信息，否则，提示不存在
        boolean f = false;
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (stu.getName().equals("李四")) {
                f = true;
                stuList.remove(i);
                i--;
            }
        }
        if (f) {
            System.out.println("删除成功");
        } else {
            System.out.println("该同学不在列表中");
        }

        for (Student student : stuList) {//循环数组
            System.out.println(student);
        }

        //修改王五的年龄，比原来的年龄大5岁
        f = false;
//        for (int i = 0; i < stuList.size(); i++) {
//            if (stuList.get(i).getName().equals("王五")){
//                stuList.get(i).setAge(stuList.get(i).getAge() + 5);
//                f = true;
//            }
//        }
        for (Student value : stuList) {
            if (value.getName().equals("王五")) {
                value.setAge(value.getAge() + 5);
                f = true;
            }
        }
        if (f) {
            System.out.println("修改成功");
        } else {
            System.out.println("没找到该学生，修改失败");
        }

        for (Student student : stuList) {//循环数组
            System.out.println(student);
        }


        //查找比平均年龄大的学生信息
        double sumAge = 0;
        for (Student student : stuList) {
            sumAge += student.getAge();
        }
        double averageAge = sumAge / stuList.size();
        System.out.println(stuList.size());
        System.out.println(sumAge);
        System.out.println(averageAge);
        for (Student student : stuList) {
            if (student.getAge() > averageAge) {
                System.out.println(student);
            }
        }
        //找到年龄最大的学生信息
        Student maxAge = stuList.get(0);
        for (Student student : stuList) {
            if (student.getAge() > maxAge.getAge()){
                maxAge = student;
            }
        }
        System.out.println(maxAge);

    }
}
