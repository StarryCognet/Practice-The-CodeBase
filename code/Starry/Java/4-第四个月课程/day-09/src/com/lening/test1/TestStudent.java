package com.lening.test1;

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

        //2.查找张三是否存在，如果存在则删除该学生信息，否则，提示不存在
        boolean f = false;      //标记    张三是否存在
        for (int i = 0; i < stuList.size(); i++) {
            //获取每一个学生信息
            Student stu = stuList.get(i);
            if (stu.getName().equals("张三")) {
                f = true;
                //删除张三
                stuList.remove(i);
                i--;        //回退指针
            }
        }

        if (f) {
            System.out.println("删除成功!");
        } else {
            System.out.println("该学生不存在，删除失败!");
        }

        //修改李四的年龄，比原来的年龄大5岁
        f = false;
        for (Student student : stuList) {
            if (student.getName().equals("李四")) {
                //修改年龄
                student.setAge(student.getAge() + 5);
                f = true;
            }
        }
        if (f) {
            System.out.println("李四存在，年龄修改成功!");
        } else {
            System.out.println("李四不存在!");
        }
        System.out.println("==========循环遍历学生信息==========");
        for (Student student : stuList) {
            System.out.println(student.toString());
        }

        //查找比平均年龄大的学生信息
        int sumAge = 0;     //年龄之和
        for (Student student : stuList) {
            sumAge = sumAge + student.getAge();
        }

        //平均年龄
        double avgAge = (double)sumAge / stuList.size();

        System.out.println("========查找比平均年龄大的学生信息=======");
        for (Student student : stuList) {
            if(student.getAge() > avgAge){
                System.out.println(student.toString());
            }
        }

        //找到年龄最大的学生信息
        System.out.println("============找到年龄最大的学生信息==========");
        //假设集合中第一个学生的年龄为最大年龄
        Student stu = stuList.get(0);
        int maxAge = stu.getAge();
        for (Student student : stuList) {
            if(student.getAge() > maxAge){
                maxAge = student.getAge();
            }
        }

        for (Student student : stuList) {
            if(student.getAge() == maxAge){
                System.out.println(student.toString());
            }
        }
    }
}
