package com.lening.test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Collections.sort(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("==========循环遍历学生信息==========");
        for (Student student : stuList) {
            System.out.println(student.toString());
        }

        System.out.println("========年龄最大的学生信息========");
        Student stuMax = Collections.max(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(stuMax.toString());


        System.out.println("========年龄最小的学生信息========");
        Student stuMin = Collections.min(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(stuMin.toString());

        //打乱集合中元素的顺序
        Collections.shuffle(stuList);
        System.out.println("==========打乱集合顺序后循环遍历学生信息==========");
        for (Student student : stuList) {
            System.out.println(student.toString());
        }

        //反转
        Collections.reverse(stuList);
        System.out.println("==========翻转后循环遍历学生信息==========");
        for (Student student : stuList) {
            System.out.println(student.toString());
        }
    }
}
