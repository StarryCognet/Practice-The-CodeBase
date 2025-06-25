package com.lening.test6;

import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        //实例化5个学生对象
        Student stu1 = new Student(1, "张三", 18, "男");
        Student stu2 = new Student(2, "李四", 22, "男");
        Student stu3 = new Student(3, "王五", 24, "女");
        Student stu4 = new Student(4, "赵六", 30, "女");
        Student stu5 = new Student(5, "田七", 40, "男");


        //创建set集合
        Set<Student> stuSet = new HashSet<Student>();

        //添加信息
        Collections.addAll(stuSet,stu1,stu2,stu3,stu4,stu5);

        //循环遍历
        System.out.println("==========循环遍历集合信息===========");
        for (Student student : stuSet) {
            System.out.println(student.toString());
        }

        //删除张三
        //获取迭代器
        boolean f = false;
        Iterator<Student> it = stuSet.iterator();
        while(it.hasNext()){
            Student stu = it.next();
            if(stu.getName().equals("张三")){
                f = true;
                //删除张三
                it.remove();
            }
        }

        if(f){
            System.out.println("删除成功!");
        }else{
            System.out.println("该学生不存在，删除失败!");
        }
        System.out.println("==========循环遍历集合信息===========");
        for (Student student : stuSet) {
            System.out.println(student.toString());
        }

    }
}
